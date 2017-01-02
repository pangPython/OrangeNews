package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.bean.User;
import cn.edu.bzu.group12.orangenews.dao.BaseDao;
import cn.edu.bzu.group12.orangenews.service.UserService;

/**
 * @author pangPython 登录servlet
 */
public class LoginServlet extends HttpServlet {

	Logger log = Logger.getLogger(LoginServlet.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserService();

	@Override
	public void service(ServletRequest req, ServletResponse rsp)
			throws ServletException, IOException {
		// 获取用户名 密码
		String uname = req.getParameter("user_name");
		String pwd = req.getParameter("user_pwd");
		// 编码
		uname = new String(uname.getBytes("iso8859-1"), "utf-8");
		pwd = new String(pwd.getBytes("iso8859-1"), "utf-8");
		User user = new User();
		try {

			user = userService.login(uname, pwd);
			if (user.getUser_id() > 0) {
				log.debug("登录成功");
				// 设置session 服务器端保存登录用户信息
				HttpSession session = ((HttpServletRequest) req)
						.getSession(true);
				// 新建cookie 客户浏览器端保存当前用户的id
				// key-value格式 key-loginuser value-当前用户的id
				Cookie cookie = new Cookie("loginuser", user.getUser_id() + "");
				// session是key-value格式
				// 把user_id作为key,value是user对象
				session.setAttribute(user.getUser_id() + "", user);
				log.debug("创建session成功！");
				// 设置客户端cookie
				((HttpServletResponse) rsp).addCookie(cookie);
				log.debug("创建cookie成功！");
				((HttpServletResponse)rsp).sendRedirect("usercenter.jsp");
//				req.setAttribute("user", user);
//				req.getRequestDispatcher("/usercenter").forward(req, rsp);
			} else {
				// 登录失败
				req.setAttribute("error_info", "登录失败！");
				req.getRequestDispatcher("/error.jsp").forward(req, rsp);
			}

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error_info", "系统异常,请稍后再试！");
			req.getRequestDispatcher("/error.jsp").forward(req, rsp);
		}

	}

}

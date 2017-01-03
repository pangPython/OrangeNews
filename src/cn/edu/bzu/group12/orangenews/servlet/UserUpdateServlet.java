package cn.edu.bzu.group12.orangenews.servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.bean.User;
import cn.edu.bzu.group12.orangenews.service.UserService;
import cn.edu.bzu.group12.orangenews.utils.CookieUtils;



/**
 * @author pangPython
 *	更新用户信息
 *
 */
public class UserUpdateServlet extends HttpServlet {
		UserService userService = new UserService();
		Logger log = Logger.getLogger(UserUpdateServlet.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		//获取提交数据
		String user_name = req.getParameter("user_name");
		int user_sex = Integer.parseInt(req.getParameter("user_sex"));
		String tel = req.getParameter("user_tel");
		String email = req.getParameter("user_email");
		
		//获取用户id
		int user_id = Integer.parseInt(CookieUtils.getCookieFromCookies(((HttpServletRequest)req).getCookies(), "loginuser").getValue());
		//更新
		HttpSession session = ((HttpServletRequest) req)
				.getSession(true);
		User luser = (User) session.getAttribute(user_id+"");
		User user = new User();
		user.setUser_id(user_id);
		user.setUser_name(user_name);
		user.setUser_sex(user_sex);
		user.setPwd(luser.getPwd());
		user.setEmail(email);
		user.setTel(tel);
		try {
			log.debug("开始更新用户信息...");
			if(userService.update(user)){
				//更新成功
				log.debug("用户信息更新成功...");
				//重新设置session
				session.setAttribute(user.getUser_id()+"", user);
				
				req.setAttribute("info", "信息更新成功！正在跳转回用户中心...");
				req.setAttribute("target", "usercenter.jsp");
				req.getRequestDispatcher("redirect.jsp").forward(req, resp);
			}else{
				//更新失败
				log.debug("用户信息更新失败...");
			}
			
		} catch (Exception e) {
			
			log.debug("捕获到异常...");
			req.setAttribute("error_info", "系统异常,请稍后重试！");
			req.getRequestDispatcher("error.jsp").forward(req, resp);
			
		}
		//返回状态
	}
	
}

package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.sql.SQLException;

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
import cn.edu.bzu.group12.orangenews.service.UserService;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Logger log = Logger.getLogger(RegisterServlet.class);
	UserService userService = new UserService();

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//获取表单数据
		User user = new User();
		int user_id = 0;
		String user_name =  (String) req.getParameter("user_name");
		int user_sex  = Integer.parseInt(req.getParameter("sex")) ;
		String pwd = (String) req.getParameter("pwd");
		String email = (String) req.getParameter("email");
		String tel = (String) req.getParameter("tel");
		
		user.setUser_name(user_name);
		user.setPwd(pwd);
		user.setUser_sex(user_sex);
		user.setEmail(email);
		user.setTel(tel);
		
		//数据检查
		
		//插入数据库
		UserService us = new UserService();
		if(us.insert(user)){
			try {
				user_id = userService.getLastInsertId();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//设置session 服务器端保存登录用户信息
			HttpSession session = ((HttpServletRequest)req).getSession(true);
			//新建cookie	客户浏览器端保存当前用户的id
			//key-value格式 key-loginuser value-当前用户的id
			Cookie cookie = new Cookie("loginuser", user_id+"");
			log.debug("!!!User_ID:!!!"+user_id+"");
			//session是key-value格式
			//把user_id作为key,value是user对象
			session.setAttribute(user_id+"", user);
			log.debug("创建session成功！");
			//设置客户端cookie
			((HttpServletResponse)res).addCookie(cookie);
			log.debug("创建cookie成功！");
			req.setAttribute("user", user);
			log.debug("user 跳转参数设置成功！");
			req.getRequestDispatcher("/usercenter.jsp").forward(req, res);
			
		}else{
			req.getRequestDispatcher("/error.jsp").forward(req, res);
		}
		
		
	}
	
}

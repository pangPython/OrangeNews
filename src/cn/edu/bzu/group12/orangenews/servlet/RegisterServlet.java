package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.bean.User;
import cn.edu.bzu.group12.orangenews.service.UserService;



/**
 * @author pangPython
 *		用户注册
 */
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
			//注册成功
			req.setAttribute("info", "注册成功！正在跳转登录页面...");
			req.setAttribute("target", "login.jsp");
			req.getRequestDispatcher("redirect.jsp").forward(req, res);
		}else{
			req.getRequestDispatcher("error.jsp").forward(req, res);
		}
		
		
	}
	
}

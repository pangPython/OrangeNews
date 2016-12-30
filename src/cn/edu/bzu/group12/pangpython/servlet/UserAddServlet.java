package cn.edu.bzu.group12.pangpython.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.pangpython.bean.User;
import cn.edu.bzu.group12.pangpython.dao.UserDao;
import cn.edu.bzu.group12.pangpython.service.UserService;

public class UserAddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//获取表单数据
		User user = new User();
		
		String user_name =  (String) req.getParameter("user_name");
		System.out.println("success");
		Logger.getLogger(UserAddServlet.class).debug(user_name);
		System.out.println("success");
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
			req.setAttribute("username", user.getUser_name());
			req.getRequestDispatcher("/addsuccess.jsp").forward(req, res);
		}else{
			req.getRequestDispatcher("/error.jsp").forward(req, res);
		}
		
		
	}
	
}

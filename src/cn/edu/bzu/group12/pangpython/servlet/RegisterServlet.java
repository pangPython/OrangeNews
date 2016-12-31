package cn.edu.bzu.group12.pangpython.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.pangpython.bean.User;
import cn.edu.bzu.group12.pangpython.service.UserService;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//��ȡ������
		User user = new User();
		
		String user_name =  (String) req.getParameter("user_name");
		System.out.println("success");
		Logger.getLogger(RegisterServlet.class).debug(user_name);
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
		
		//���ݼ��
		
		//�������ݿ�
		UserService us = new UserService();
		if(us.insert(user)){
			req.setAttribute("user", user);
			req.getRequestDispatcher("/usercenter.jsp").forward(req, res);
		}else{
			req.getRequestDispatcher("/error.jsp").forward(req, res);
		}
		
		
	}
	
}

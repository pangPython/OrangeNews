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
		//��ȡ������
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
		
		//���ݼ��
		
		//�������ݿ�
		UserService us = new UserService();
		if(us.insert(user)){
			//ע��ɹ�
			req.setAttribute("info", "ע��ɹ���������ת��¼ҳ��...");
			req.setAttribute("target", "login.jsp");
			req.getRequestDispatcher("redirect.jsp").forward(req, res);
		}else{
			req.getRequestDispatcher("error.jsp").forward(req, res);
		}
		
		
	}
	
}

package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import cn.edu.bzu.group12.orangenews.bean.User;

public class NewsServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
	
		List<User> list = new ArrayList<User>();
		
		for (int i = 0; i < 20; i++) {
			User user = new User();
			user.setUser_id(i);
			user.setUser_name("pangPython");
			user.setUser_sex(1);
			user.setTel("15762180000");
			user.setEmail("pangpython@qq.com");
			list.add(user);
		}
		
		req.setAttribute("userList", list);
		req.getRequestDispatcher("/list.jsp").forward(req, res);
	}
	
}

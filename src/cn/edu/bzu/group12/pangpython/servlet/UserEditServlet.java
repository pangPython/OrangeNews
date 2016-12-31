package cn.edu.bzu.group12.pangpython.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import cn.edu.bzu.group12.pangpython.bean.User;
import cn.edu.bzu.group12.pangpython.service.UserService;

public class UserEditServlet extends HttpServlet {

	/**
	 * 编辑用户 业务逻辑
	 */
	private static final long serialVersionUID = 1L;
	private UserService us = new UserService();
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//获取用户id
		int user_id = Integer.parseInt(req.getParameter("uid"));
		//查询用户信息
		try {
			User user = us.getUserById(user_id);
			//返回jsp页面
			req.setAttribute("user", user);
			req.getRequestDispatcher("/edituser.jsp").forward(req, res);
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
	}

	
}

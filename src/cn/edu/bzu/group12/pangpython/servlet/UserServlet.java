package cn.edu.bzu.group12.pangpython.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.bzu.group12.pangpython.bean.User;
import cn.edu.bzu.group12.pangpython.dao.BaseDao;
import cn.edu.bzu.group12.pangpython.service.UserService;

public class UserServlet extends HttpServlet {

	/**
	 * User���Ʋ�
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	UserService us = new UserService();
	
	@Override
	public void service(ServletRequest req, ServletResponse rsp)
			throws ServletException, IOException {
			try {
			
				List<User> list = us.getAllUser();
				req.setAttribute("users", list);
				req.getRequestDispatcher("/users.jsp").forward(req, rsp);

			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	

}

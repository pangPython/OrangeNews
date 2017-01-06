package cn.edu.bzu.group12.orangenews.servlet.admin;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.bzu.group12.orangenews.bean.User;
import cn.edu.bzu.group12.orangenews.service.UserService;

/**
 * @author pangPython
 *	显示用户列表
 */
public class AdminUserListServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	UserService userService = new UserService();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<User> userList = new ArrayList<User>();
		
		try {
			
			userList = userService.getAllUser();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		req.setAttribute("userList", userList);
		req.getRequestDispatcher("admin/userlist.jsp").forward(req, resp);
		
	}
	
}

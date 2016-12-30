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

public class UserServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse rsp)
			throws ServletException, IOException {
		List<User> list = new ArrayList<User>();
			
		try {
			BaseDao baseDao = new BaseDao();
			
			ResultSet rs = baseDao.Query(baseDao.getConn(), baseDao.getStat(), "select * from user");
			
			
			while (rs.next()) {
				User user = new User();
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_name(rs.getString("user_name"));
				user.setUser_sex(rs.getInt("user_sex"));
				user.setTel(rs.getString("tel"));
				user.setEmail(rs.getString("email"));
				list.add(user);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			req.setAttribute("users", list);
			req.getRequestDispatcher("/users.jsp").forward(req, rsp);
	}
	

}

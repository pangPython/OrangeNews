package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import cn.edu.bzu.group12.orangenews.bean.User;
import cn.edu.bzu.group12.orangenews.service.UserService;
import cn.edu.bzu.group12.orangenews.utils.CookieUtils;


/**
 * @author pangPython
 *		用户中心
 */
public class UserCenterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserService();
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//根据cookie储存的用户id获取session
		Cookie cookie = CookieUtils.getCookieFromCookies(((HttpServletRequest)req).getCookies(), "loginuser");
		User user = null;
		try {
			
			user = userService.getUserById(Integer.parseInt(cookie.getValue()));
		
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		req.setAttribute("user", user);
		req.getRequestDispatcher("/usercenter.jsp").forward(req, res);
	}
	
}

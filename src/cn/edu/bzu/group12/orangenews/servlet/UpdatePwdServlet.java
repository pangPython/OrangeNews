package cn.edu.bzu.group12.orangenews.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import cn.edu.bzu.group12.orangenews.utils.CookieUtils;

/**
 * @author pangPython
 *	�û��޸�����
 */
public class UpdatePwdServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		req.getRequestDispatcher("/updatepwd.jsp").forward(req, res);
	}
	
}

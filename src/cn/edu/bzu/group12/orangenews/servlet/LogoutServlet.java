package cn.edu.bzu.group12.orangenews.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.bzu.group12.orangenews.utils.CookieUtils;

/**
 * @author pangPython
 *	用户退出Servlet
 *
 */
public class LogoutServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//获取cookie
		Cookie cookie = CookieUtils.getCookieFromCookies(((HttpServletRequest)req).getCookies(), "loginuser");
		//获取session
		HttpSession session = ((HttpServletRequest)req).getSession();
		//移除session
		session.removeAttribute(cookie.getValue());
		//销毁cookie
		CookieUtils.removeCookieByName("loginuser", (HttpServletRequest)req, (HttpServletResponse)res);
		//返回主页
		req.getRequestDispatcher("/ShowAllServlet").forward(req, res);
	}
	
}

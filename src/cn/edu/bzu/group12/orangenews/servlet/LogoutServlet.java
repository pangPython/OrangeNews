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

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.utils.CookieUtils;

/**
 * @author pangPython
 *	用户退出Servlet
 *
 */
public class LogoutServlet extends HttpServlet {
		
	Logger log  = Logger.getLogger(LogoutServlet.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		
		Cookie cookie = CookieUtils.getCookieFromCookies(((HttpServletRequest)req).getCookies(), "loginuser");
		log.debug("获取cookie");
		HttpSession session = ((HttpServletRequest)req).getSession();
		log.debug("获取session");
		session.removeAttribute(cookie.getValue());
		log.debug("移除session");
		CookieUtils.removeCookieByName("loginuser", (HttpServletRequest)req, (HttpServletResponse)res);
		log.debug("销毁cookie");
		((HttpServletResponse)res).sendRedirect("ShowAllServlet");
		log.debug("返回主页");
	}
	
}

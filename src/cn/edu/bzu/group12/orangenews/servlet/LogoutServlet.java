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
 *	�û��˳�Servlet
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
		log.debug("��ȡcookie");
		HttpSession session = ((HttpServletRequest)req).getSession();
		log.debug("��ȡsession");
		session.removeAttribute(cookie.getValue());
		log.debug("�Ƴ�session");
		CookieUtils.removeCookieByName("loginuser", (HttpServletRequest)req, (HttpServletResponse)res);
		log.debug("����cookie");
		((HttpServletResponse)res).sendRedirect("ShowAllServlet");
		log.debug("������ҳ");
	}
	
}

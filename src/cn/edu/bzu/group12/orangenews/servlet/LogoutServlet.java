package cn.edu.bzu.group12.orangenews.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cn.edu.bzu.group12.orangenews.utils.CookieUtils;

/**
 * @author pangPython
 *	�û��˳�Servlet
 *
 */
public class LogoutServlet extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//��ȡcookie
		Cookie cookie = CookieUtils.getCookieFromCookies(((HttpServletRequest)req).getCookies(), "loginuser");
		//��ȡsession
		HttpSession session = ((HttpServletRequest)req).getSession();
		//�Ƴ�session
		session.removeAttribute(cookie.getValue());
		//����cookie
		cookie.setMaxAge(0);
		//������ҳ
		req.getRequestDispatcher("/ShowAllServlet").forward(req, res);
	}
	
}

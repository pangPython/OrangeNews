package cn.edu.bzu.group12.pangpython.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
 * @author pangPython
 *	�û��޸�����
 */
public class UpdatePwdServlet extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		int user_id = Integer.parseInt(req.getParameter("uid"));
		
		
		
	}
	
}

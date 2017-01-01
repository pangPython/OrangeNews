package cn.edu.bzu.group12.orangenews.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
 * @author pangPython
 *	”√ªß–ﬁ∏ƒ√‹¬Î
 */
public class UpdatePwdServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//int user_id = Integer.parseInt(req.getParameter("uid"));
		req.getRequestDispatcher("/updatepwd.jsp").forward(req, res);
		
		
	}
	
}

package cn.edu.bzu.group12.pangpython.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import cn.edu.bzu.group12.pangpython.bean.User;


/**
 * @author pangPython
 *		�û�����
 */
public class UserCenterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		User user = (User) req.getAttribute("user");
		req.setAttribute("user", user);
		req.getRequestDispatcher("/usercenter.jsp").forward(req, res);
	}
	
}

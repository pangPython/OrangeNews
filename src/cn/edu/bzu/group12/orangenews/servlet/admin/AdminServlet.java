package cn.edu.bzu.group12.orangenews.servlet.admin;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author pangPython
 *	ºóÌ¨servlet
 */
public class AdminServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//¼ì²âµÇÂ¼×´Ì¬
		req.getRequestDispatcher("admin/index.jsp").forward(req, res);
		//Ìø×ªÒ³Ãæ
	}
	
}

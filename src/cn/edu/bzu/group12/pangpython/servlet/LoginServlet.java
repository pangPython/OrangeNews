package cn.edu.bzu.group12.pangpython.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.pangpython.dao.BaseDao;



/**
 * @author pangPython
 *	登录servlet
 */
public class LoginServlet extends HttpServlet {
	static Logger log = Logger.getLogger(LoginServlet.class.getName());
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse rep)
			throws ServletException, IOException {
			BaseDao baseDao = null;
			boolean flag = false;
			//获取用户名 密码
			String uname = req.getParameter("uname");
			String pwd = req.getParameter("pwd");
			//编码
			uname = new String(uname.getBytes("iso8859-1"),"utf-8");
			pwd = new String(pwd.getBytes("iso8859-1"),"utf-8");
			String sql = "select * from user where user_name = '"+uname+"' and pwd = '"+pwd+"'"; 
			try {
				 baseDao = new BaseDao();
				 log.debug(sql);
				 if(baseDao.Query(baseDao.getConn(), baseDao.getStat(), 
						 sql).next()){
					 flag = true;
				 }
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//验证
			if (flag) {
				req.setAttribute("uname", uname);
				req.getRequestDispatcher("/success.jsp").forward(req, rep);
			}else{
				req.getRequestDispatcher("/error.jsp").forward(req, rep);
			}
			
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}

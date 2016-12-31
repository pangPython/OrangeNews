package cn.edu.bzu.group12.pangpython.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.pangpython.bean.User;
import cn.edu.bzu.group12.pangpython.dao.BaseDao;
import cn.edu.bzu.group12.pangpython.service.UserService;



/**
 * @author pangPython
 *	��¼servlet
 */
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserService();
	@Override
	public void service(ServletRequest req, ServletResponse rsp)
			throws ServletException, IOException {
		//��ȡ�û��� ����
		String uname = req.getParameter("user_name");
		String pwd = req.getParameter("user_pwd");
		//����
		uname = new String(uname.getBytes("iso8859-1"),"utf-8");
		pwd = new String(pwd.getBytes("iso8859-1"),"utf-8");
		User user = new User();
		try {
			user = userService.login(uname, pwd);
			if(user.getUser_id()>0){
				//��¼�ɹ�
				req.setAttribute("user", user);
				req.getRequestDispatcher("/usercenter").forward(req, rsp);
			}else{
				//��¼ʧ��
				req.setAttribute("error_info", "��¼ʧ�ܣ�");
				req.getRequestDispatcher("/error.jsp").forward(req, rsp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			req.setAttribute("error_info", "ϵͳ�쳣,���Ժ����ԣ�");
			req.getRequestDispatcher("/error.jsp").forward(req, rsp);
		}
		
	}
		
}

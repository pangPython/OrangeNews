package cn.edu.bzu.group12.orangenews.servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.bzu.group12.orangenews.service.UserService;
import cn.edu.bzu.group12.orangenews.utils.CookieUtils;

/**
 * @author pangPython
 *	�û��޸�����
 */
public class UpdatePwdServlet extends HttpServlet {
	
	UserService userService = new UserService(); 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//������
		String old_pwd = (((HttpServletRequest)req).getParameter("old_pwd")).toString();
		System.out.println(old_pwd);
		//������
		String new_pwd = (((HttpServletRequest)req).getParameter("new_pwd")).toString();
		//ȷ������
		String confirm_pwd = (((HttpServletRequest)req).getParameter("confirm_pwd")).toString();
		//������֤
		if(!new_pwd.equals(confirm_pwd)){
			//�¾����벻ƥ��
			req.setAttribute("info", "�¾����벻ƥ��");
			req.setAttribute("target", "updatepwd.jsp");
			req.getRequestDispatcher("redirect.jsp").forward(req, res);
		}
		//��ȡ�û�id
		int  user_id = Integer.parseInt(CookieUtils.getCookieFromCookies(((HttpServletRequest)req).getCookies(), "loginuser").getValue());
		//��������
		try {
			if(userService.updatepwd(user_id, new_pwd)){
				req.setAttribute("info", "������³ɹ������ڷ�����һҳ��");
				req.setAttribute("target", "updatepwd.jsp");
				req.getRequestDispatcher("redirect.jsp").forward(req, res);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}

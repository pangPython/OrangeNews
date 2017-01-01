package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import cn.edu.bzu.group12.orangenews.bean.User;
import cn.edu.bzu.group12.orangenews.service.UserService;

public class UserEditServlet extends HttpServlet {

	/**
	 * �༭�û� ҵ���߼�
	 */
	private static final long serialVersionUID = 1L;
	private UserService us = new UserService();
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//��ȡ�û�id
		int user_id = Integer.parseInt(req.getParameter("uid"));
		//��ѯ�û���Ϣ
		try {
			User user = us.getUserById(user_id);
			//����jspҳ��
			req.setAttribute("user", user);
			req.getRequestDispatcher("/edituser.jsp").forward(req, res);
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
	}

	
}

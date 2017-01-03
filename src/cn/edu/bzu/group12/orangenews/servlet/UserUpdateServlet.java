package cn.edu.bzu.group12.orangenews.servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.bean.User;
import cn.edu.bzu.group12.orangenews.service.UserService;
import cn.edu.bzu.group12.orangenews.utils.CookieUtils;



/**
 * @author pangPython
 *	�����û���Ϣ
 *
 */
public class UserUpdateServlet extends HttpServlet {
		UserService userService = new UserService();
		Logger log = Logger.getLogger(UserUpdateServlet.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		//��ȡ�ύ����
		String user_name = req.getParameter("user_name");
		int user_sex = Integer.parseInt(req.getParameter("user_sex"));
		String tel = req.getParameter("user_tel");
		String email = req.getParameter("user_email");
		
		//��ȡ�û�id
		int user_id = Integer.parseInt(CookieUtils.getCookieFromCookies(((HttpServletRequest)req).getCookies(), "loginuser").getValue());
		//����
		HttpSession session = ((HttpServletRequest) req)
				.getSession(true);
		User luser = (User) session.getAttribute(user_id+"");
		User user = new User();
		user.setUser_id(user_id);
		user.setUser_name(user_name);
		user.setUser_sex(user_sex);
		user.setPwd(luser.getPwd());
		user.setEmail(email);
		user.setTel(tel);
		try {
			log.debug("��ʼ�����û���Ϣ...");
			if(userService.update(user)){
				//���³ɹ�
				log.debug("�û���Ϣ���³ɹ�...");
				//��������session
				session.setAttribute(user.getUser_id()+"", user);
				
				req.setAttribute("info", "��Ϣ���³ɹ���������ת���û�����...");
				req.setAttribute("target", "usercenter.jsp");
				req.getRequestDispatcher("redirect.jsp").forward(req, resp);
			}else{
				//����ʧ��
				log.debug("�û���Ϣ����ʧ��...");
			}
			
		} catch (Exception e) {
			
			log.debug("�����쳣...");
			req.setAttribute("error_info", "ϵͳ�쳣,���Ժ����ԣ�");
			req.getRequestDispatcher("error.jsp").forward(req, resp);
			
		}
		//����״̬
	}
	
}

package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.bean.User;
import cn.edu.bzu.group12.orangenews.dao.BaseDao;
import cn.edu.bzu.group12.orangenews.service.UserService;



/**
 * @author pangPython
 *	��¼servlet
 */
public class LoginServlet extends HttpServlet {

	Logger log = Logger.getLogger(LoginServlet.class);
	
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
				log.debug("��¼�ɹ�");
				//��¼�ɹ�
				//����session �������˱����¼�û���Ϣ
				HttpSession session = ((HttpServletRequest)req).getSession(false);
				//�½�cookie	�ͻ�������˱��浱ǰ�û���id
				//key-value��ʽ key-loginuser value-��ǰ�û���id
				Cookie cookie = new Cookie("loginuser", user.getUser_id()+"");
				//session��key-value��ʽ
				//��user_id��Ϊkey,value��user����
				session.setAttribute(user.getUser_id()+"", user);
				log.debug("����session�ɹ���");
				//���ÿͻ���cookie
				((HttpServletResponse)rsp).addCookie(cookie);
				log.debug("����cookie�ɹ���");
				req.setAttribute("user", user);
				req.getRequestDispatcher("/usercenter").forward(req, rsp);
			}else{
				//��¼ʧ��
				req.setAttribute("error_info", "��¼ʧ�ܣ�");
				req.getRequestDispatcher("/error.jsp").forward(req, rsp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error_info", "ϵͳ�쳣,���Ժ����ԣ�");
			req.getRequestDispatcher("/error.jsp").forward(req, rsp);
		}
		
	}
		
}

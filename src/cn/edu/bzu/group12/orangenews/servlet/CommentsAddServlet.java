package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.dao.CommentsDao;
import cn.edu.bzu.group12.orangenews.service.CommentsService;
import cn.edu.bzu.group12.orangenews.utils.CookieUtils;

/**
 * @author ���� �������
 */
public class CommentsAddServlet extends HttpServlet {

	Logger log = Logger.getLogger(CommentsAddServlet.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CommentsService cs = new CommentsService();
	CommentsDao cd = new CommentsDao();

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int user_id = 0;

		try {
			log.debug("���ۻ�ȡuser_id...");
			// ��ȡ�û�id
			user_id = Integer.parseInt(CookieUtils
					.getCookieFromCookies(req.getCookies(), "loginuser")
					.getValue().toString());
			
			log.debug("�Ѿ���ȡUser_id:"+user_id);
			
			// �ж��û��Ƿ��¼
			if (user_id == 0) {
			
				log.debug("�ж��û��Ƿ��¼...");
				req.setAttribute("info", "��δ��¼��������,���ȵ�¼...");
				req.setAttribute("target", "login.jsp");
				req.getRequestDispatcher("redirect.jsp").forward(req, resp);
				log.debug("û�е�¼������ת...");
				return;
			}

		} catch (Exception e) {

			req.setAttribute("info", "��δ��¼��������,���ȵ�¼...");
			req.setAttribute("target", "login.jsp");
			req.getRequestDispatcher("redirect.jsp").forward(req, resp);
			log.debug("�����쳣������ת...");
			return;

		}

		try {

			// ��������
			int news_id = Integer.parseInt(req.getParameter("news_id"));
			String content = req.getParameter("content");
			// �������ݿ�
			content = new String(content.getBytes("iso8859-1"), "utf-8");

			System.out.println(content);

			cs.addComment(news_id, user_id, content);
			resp.sendRedirect("ShowOneServlet?id=" + news_id);

		} catch (SQLException e) {
			// ����ʧ��
			e.printStackTrace();
			req.setAttribute("error_info", "����ʧ�ܣ����Ժ�����...");
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}

	}
}

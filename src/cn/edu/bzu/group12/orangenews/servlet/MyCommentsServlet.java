package cn.edu.bzu.group12.orangenews.servlet;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import cn.edu.bzu.group12.orangenews.bean.Comments;
import cn.edu.bzu.group12.orangenews.utils.CookieUtils;

/**
 * @author pangPython
 *	�鿴��ǰ�û�����������
 *
 */
public class MyCommentsServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CommentsService commentsService = new CommentsService();
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		try {
			//��ȡ��ǰ�û�id
			Cookie cookie = CookieUtils.getCookieFromCookies(((HttpServletRequest)req).getCookies(), "loginuser");
			int user_id = Integer.parseInt(((HttpServletRequest)req).getSession().getAttribute(cookie.getValue()).toString());
			//��ѯ�����������б�
			List<Comments> list = commentsService.getAllCommentsByUserId(user_id);
			req.setAttribute("commentslist", list);
			req.getRequestDispatcher("/mycomments.jsp").forward(req, res);
			
		} catch (SQLException e) {
			e.printStackTrace();
			req.getRequestDispatcher("/error.jsp").forward(req, res);
		}
	}
		
}

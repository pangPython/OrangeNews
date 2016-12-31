package cn.edu.bzu.group12.pangpython.servlet;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import cn.edu.bzu.group12.pangpython.bean.Comments;

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
			//��ѯ�����������б�
			List<Comments> list = commentsService.allComments();
			req.setAttribute("newslist", list);
			req.getRequestDispatcher("/mycomments.jsp").forward(req, res);
			
		} catch (SQLException e) {
			e.printStackTrace();
			req.getRequestDispatcher("/error.jsp").forward(req, res);
		}
	}
		
}

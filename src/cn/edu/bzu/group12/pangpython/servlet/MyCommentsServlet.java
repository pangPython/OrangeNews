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
 *	查看当前用户的所有评论
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
			//获取当前用户id
			//查询并返回评论列表
			List<Comments> list = commentsService.allComments();
			req.setAttribute("newslist", list);
			req.getRequestDispatcher("/mycomments.jsp").forward(req, res);
			
		} catch (SQLException e) {
			e.printStackTrace();
			req.getRequestDispatcher("/error.jsp").forward(req, res);
		}
	}
		
}

package cn.edu.bzu.group12.orangenews.servlet.admin;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.bzu.group12.orangenews.bean.Comments;
import cn.edu.bzu.group12.orangenews.service.CommentsService;



/**
 * @author pangPython
 *	后台显示评论列表
 *
 */
public class AdminCommentsListServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CommentsService commentsService = new CommentsService();
	List<Comments> commentsList = new ArrayList<Comments>(); 
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
		try {
				
				commentsList = commentsService.getAllComments();
			
			} catch (SQLException e) {

				e.printStackTrace();
			
			}
		req.setAttribute("commentslist", commentsList);
		req.getRequestDispatcher("admin/commentslist.jsp").forward(req, resp);
	}

	
	
}

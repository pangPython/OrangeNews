package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.bzu.group12.orangenews.bean.Comments;
import cn.edu.bzu.group12.orangenews.bean.CommentsAndUser;
import cn.edu.bzu.group12.orangenews.bean.News;
import cn.edu.bzu.group12.orangenews.service.CommentsService;
import cn.edu.bzu.group12.orangenews.service.NewsService;


/**
 * @author 程锐
 * 显示单个新闻
 *
 */
public class ShowOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowOneServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		int news_id = Integer.parseInt(req.getParameter("id"));
		NewsService ns = new NewsService();
		CommentsService commentsService = new CommentsService();
		News n = new News();
		//单个新闻
		List<News> list1 = new ArrayList<News>();
		//相关新闻
		List<News> list2 = new ArrayList<News>();
		//评论
		List<CommentsAndUser> commentsList = new ArrayList<CommentsAndUser>();
		
		try {
			
			n = ns.getOneNews(news_id);
			list1.add(n);
			list2=ns.get3TypeNews(n.getType());
			String s = ns.SelectType(n.getType());
			
			commentsList = commentsService.getCmtsAndUserNameByNewsId(news_id);
			
			req.setAttribute("ts", s);
			req.setAttribute("news", list1);
			req.setAttribute("tnews", list2);
			req.setAttribute("news_id", news_id);
			req.setAttribute("news_title", n.getTitle());
			req.setAttribute("commentsList", commentsList);
			
			req.getRequestDispatcher("/single.jsp").forward(req, rep);
			
		} catch (Exception e) {
			req.getRequestDispatcher("/404.jsp").forward(req, rep);
			e.printStackTrace();
		}
	}

}

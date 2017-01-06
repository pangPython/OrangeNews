package cn.edu.bzu.group12.orangenews.servlet.admin;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.bzu.group12.orangenews.bean.News;
import cn.edu.bzu.group12.orangenews.service.NewsService;

/**
 * @author pangPython
 *	后台新闻列表
 *
 */
public class AdminNewsListServlet extends HttpServlet {

	/**
	 * 
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	NewsService newsService= new NewsService();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<News> newsList = new ArrayList<News>();
		
		
		//获取新闻新闻列表
		try {
			
			newsList = newsService.getAllNews();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		//显示
		req.setAttribute("newsList", newsList);
		req.getRequestDispatcher("admin/newslist.jsp").forward(req, resp);
	}

}

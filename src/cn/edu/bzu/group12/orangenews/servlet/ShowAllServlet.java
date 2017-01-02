package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.bean.News;
import cn.edu.bzu.group12.orangenews.service.NewsService;

/**
 * 首页Servlet
 */
public class ShowAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Logger log = Logger.getLogger(ShowAllServlet.class);
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
				NewsService ns = new NewsService();
				log.debug("show all news");
				try {
					
					List<News> list = new ArrayList<News>();
					List<News> list_hot_news = new ArrayList<News>();
					list = ns.getAllNews();
					log.debug("get all news");
					list_hot_news =  ns.getHotNews();
					log.debug("get hot news");
					req.setAttribute("list", list);
					log.debug("set attr all news list");
					req.setAttribute("list_hot_news", list_hot_news);
					log.debug("set hot news list");
					req.getRequestDispatcher("/index.jsp").forward(req, res);
					
				} catch (Exception e) {
					req.setAttribute("error_info", "获取新闻失败！");
					req.getRequestDispatcher("/error.jsp").forward(req, res);
					e.printStackTrace();
				}
	}
   
}

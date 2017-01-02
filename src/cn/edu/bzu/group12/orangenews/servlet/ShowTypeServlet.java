package cn.edu.bzu.group12.orangenews.servlet;

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
 * Servlet implementation class ShowTypeServlet
 */
public class ShowTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowTypeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		int pg = Integer.parseInt(req.getParameter("pg"));
		System.out.println("this is type"+num+" and pg:"+pg);
		NewsService ns = new NewsService();
		List<News> list1 = new ArrayList<News>();
		List<News> list2 = new ArrayList<News>();
		try {
			list1=ns.getTypeNews(num,pg);
			list2=ns.getTHotNews(num);
			String s = ns.SelectType(num);
			int p = ns.getPage(num);
			
			req.setAttribute("ts", s);//板块名
			req.setAttribute("tyn", num);//板块代码
			req.setAttribute("page", p);//总页面
			req.setAttribute("tpnews", list1);//板块全部新闻
			req.setAttribute("thnews", list2);//板块热点新闻

			req.getRequestDispatcher("/TypeNews.jsp").forward(req, rep);
		} catch (Exception e) {

			req.getRequestDispatcher("/404.jsp").forward(req, rep);
			e.printStackTrace();
		}
	}

}

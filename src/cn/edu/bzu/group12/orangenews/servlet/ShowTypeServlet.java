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
		// TODO Auto-generated method stub
		int num = Integer.parseInt(req.getParameter("num"));
		System.out.println("this is type"+num);
		NewsService ns = new NewsService();
		List<News> list = new ArrayList<News>();
		try {
			list=ns.getTypeNews(num);
			String s = ns.SelectType(num);
			req.setAttribute("ts", s);
			req.setAttribute("tpnews", list);
			req.getRequestDispatcher("/TypeNews.jsp").forward(req, rep);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			req.getRequestDispatcher("/404.jsp").forward(req, rep);
			e.printStackTrace();
		}
	}

}

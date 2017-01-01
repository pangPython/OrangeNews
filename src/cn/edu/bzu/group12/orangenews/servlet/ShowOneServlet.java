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
 * Servlet implementation class ShowOneServlet
 */
public class ShowOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowOneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int news_id = Integer.parseInt(req.getParameter("id"));
		NewsService ns = new NewsService();
		News n = new News();
		List<News> list1 = new ArrayList<News>();
		List<News> list2 = new ArrayList<News>();
		try {
			n = ns.getOneNews(news_id);
			list1.add(n);
			//System.out.println("type:"+n.getType());
			list2=ns.get3TypeNews(n.getType());
			String s = ns.SelectType(n.getType());
			req.setAttribute("ts", s);
			//System.out.println(n.getContent());
			req.setAttribute("news", list1);
			req.setAttribute("tnews", list2);
			
			req.getRequestDispatcher("/single.jsp").forward(req, rep);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			req.getRequestDispatcher("/404.jsp").forward(req, rep);
			e.printStackTrace();
		}
	}

}

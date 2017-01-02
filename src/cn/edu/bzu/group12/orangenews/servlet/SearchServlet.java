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

 * Servlet implementation class SearchServlet

 */
public class SearchServlet extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**

     * @see HttpServlet#HttpServlet()

     */
    public SearchServlet() {
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

		System.out.println("this is searchservlet");
		String str = req.getParameter("str");
		int pg = Integer.parseInt(req.getParameter("pg"));
		str=new String(str.getBytes("iso-8859-1"),"utf-8");
		System.out.println(str);
		NewsService ns = new NewsService();
		try {
			List<News> list = new ArrayList<News>();
			int num = ns.getPage(str);//数目

			int p=num%20==0?num/20:num/20+1;//总页数

			list = ns.getSearchNews(str,pg);
			req.setAttribute("num", num);
			req.setAttribute("s", str);
			req.setAttribute("p", p);
			req.setAttribute("sch", list);
			req.getRequestDispatcher("/search.jsp").forward(req, rep);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
package cn.edu.bzu.group12.orangenews.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.dao.CommentsDao;
import cn.edu.bzu.group12.orangenews.service.CommentsService;
import cn.edu.bzu.group12.orangenews.utils.CookieUtils;

/**
 * @author 许桓彩 添加评论
 */
public class CommentsAddServlet extends HttpServlet {

	Logger log = Logger.getLogger(CommentsAddServlet.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CommentsService cs = new CommentsService();
	CommentsDao cd = new CommentsDao();

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int user_id = 0;

		try {
			log.debug("评论获取user_id...");
			// 获取用户id
			user_id = Integer.parseInt(CookieUtils
					.getCookieFromCookies(req.getCookies(), "loginuser")
					.getValue().toString());
			
			log.debug("已经获取User_id:"+user_id);
			
			// 判断用户是否登录
			if (user_id == 0) {
			
				log.debug("判断用户是否登录...");
				req.setAttribute("info", "您未登录不能评论,请先登录...");
				req.setAttribute("target", "login.jsp");
				req.getRequestDispatcher("redirect.jsp").forward(req, resp);
				log.debug("没有登录被迫跳转...");
				return;
			}

		} catch (Exception e) {

			req.setAttribute("info", "您未登录不能评论,请先登录...");
			req.setAttribute("target", "login.jsp");
			req.getRequestDispatcher("redirect.jsp").forward(req, resp);
			log.debug("出现异常被迫跳转...");
			return;

		}

		try {

			// 接收数据
			int news_id = Integer.parseInt(req.getParameter("news_id"));
			String content = req.getParameter("content");
			// 插入数据库
			content = new String(content.getBytes("iso8859-1"), "utf-8");

			System.out.println(content);

			cs.addComment(news_id, user_id, content);
			resp.sendRedirect("ShowOneServlet?id=" + news_id);

		} catch (SQLException e) {
			// 评论失败
			e.printStackTrace();
			req.setAttribute("error_info", "评论失败！请稍后重试...");
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}

	}
}

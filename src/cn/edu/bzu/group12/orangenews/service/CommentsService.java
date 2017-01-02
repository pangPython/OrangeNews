package cn.edu.bzu.group12.orangenews.service;

import java.sql.SQLException;
import java.util.List;

import cn.edu.bzu.group12.orangenews.bean.Comments;
import cn.edu.bzu.group12.orangenews.dao.CommentsDao;


/**
 * @author pangPython
 *	评论的业务逻辑
 */
public class CommentsService {

	CommentsDao commentsDao = new CommentsDao();
	
	//获取所有评论
	public List<Comments> allComments() throws SQLException {
		return  commentsDao.getAllComments();
		
	}
	
	//获取当前用户所有评论
	public List<Comments> getAllCommentsByUserId(int user_id) throws SQLException{
		return commentsDao.getCmtsByUId(user_id);
	}
	
	//根据新闻id获取评论
	public List<Comments> getCmtsByNewsId(int news_id) throws SQLException{
		return commentsDao.getCmtsByNId(news_id);
	}
	

}

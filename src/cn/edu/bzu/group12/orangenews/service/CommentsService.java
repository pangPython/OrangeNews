package cn.edu.bzu.group12.orangenews.service;

import java.sql.SQLException;
import java.util.List;

import cn.edu.bzu.group12.orangenews.bean.Comments;
import cn.edu.bzu.group12.orangenews.bean.CommentsAndUser;
import cn.edu.bzu.group12.orangenews.dao.CommentsAndUserDao;
import cn.edu.bzu.group12.orangenews.dao.CommentsDao;


/**
 * @author pangPython
 *	评论的业务逻辑
 */
public class CommentsService {

	CommentsDao commentsDao = new CommentsDao();
	CommentsAndUserDao commentsAndUserDao =  new CommentsAndUserDao();
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
	//根据新闻id获取评论和用户名
	public List<CommentsAndUser> getCmtsAndUserNameByNewsId(int news_id) throws SQLException{
			return commentsAndUserDao.getCmtsAndUserNameByNId(news_id);
	}
	
	
	//添加评论
	//@author 许桓彩
	public boolean addComment(int news_id,int user_id, String content) throws SQLException {
		return commentsDao.addComments(news_id,user_id, content);
	}

	

}

package cn.edu.bzu.group12.orangenews.service;

import java.sql.SQLException;
import java.util.List;

import cn.edu.bzu.group12.orangenews.bean.Comments;
import cn.edu.bzu.group12.orangenews.bean.CommentsAndUser;
import cn.edu.bzu.group12.orangenews.dao.CommentsAndUserDao;
import cn.edu.bzu.group12.orangenews.dao.CommentsDao;


/**
 * @author pangPython
 *	���۵�ҵ���߼�
 */
public class CommentsService {

	CommentsDao commentsDao = new CommentsDao();
	CommentsAndUserDao commentsAndUserDao =  new CommentsAndUserDao();
	//��ȡ��������
	public List<Comments> allComments() throws SQLException {
		return  commentsDao.getAllComments();
		
	}
	
	//��ȡ��ǰ�û���������
	public List<Comments> getAllCommentsByUserId(int user_id) throws SQLException{
		return commentsDao.getCmtsByUId(user_id);
	}
	
	//��������id��ȡ����
	public List<Comments> getCmtsByNewsId(int news_id) throws SQLException{
		return commentsDao.getCmtsByNId(news_id);
	}
	//��������id��ȡ���ۺ��û���
	public List<CommentsAndUser> getCmtsAndUserNameByNewsId(int news_id) throws SQLException{
			return commentsAndUserDao.getCmtsAndUserNameByNId(news_id);
	}
	
	
	//�������
	//@author ����
	public boolean addComment(int news_id,int user_id, String content) throws SQLException {
		return commentsDao.addComments(news_id,user_id, content);
	}

	//��ȡ��������
	public List<Comments> getAllComments() throws SQLException {
		return commentsDao.getAllComments();
	}



	

}

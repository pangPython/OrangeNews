package cn.edu.bzu.group12.pangpython.servlet;

import java.sql.SQLException;
import java.util.List;

import cn.edu.bzu.group12.pangpython.bean.Comments;
import cn.edu.bzu.group12.pangpython.dao.CommentsDao;


/**
 * @author pangPython
 *	���۵�ҵ���߼�
 */
public class CommentsService {

	CommentsDao commentsDao = new CommentsDao();
	
	//��ȡ��������
	public List<Comments> allComments() throws SQLException {
		return  commentsDao.getAllComments();
		
	}

}

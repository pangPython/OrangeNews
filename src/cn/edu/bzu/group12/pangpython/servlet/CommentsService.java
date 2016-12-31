package cn.edu.bzu.group12.pangpython.servlet;

import java.sql.SQLException;
import java.util.List;

import cn.edu.bzu.group12.pangpython.bean.Comments;
import cn.edu.bzu.group12.pangpython.dao.CommentsDao;


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

}

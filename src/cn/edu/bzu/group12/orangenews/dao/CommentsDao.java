package cn.edu.bzu.group12.orangenews.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.bzu.group12.orangenews.bean.Comments;


/**
 * @author pangPython
 *	
 */
public class CommentsDao extends BaseDao{
	
	//获取所有评论
	public List<Comments> getAllComments() throws SQLException{
		List<Comments> list = new ArrayList<Comments>();
		String sql = "select * from comments";
		ResultSet rs = this.getStat().executeQuery(sql);
		
		while (rs.next()) {
			Comments comments = new Comments();
			comments.setComments_id(rs.getInt("comments_id"));
			comments.setNews_id(rs.getInt("news_id"));
			comments.setUser_id(rs.getInt("user_id"));
			comments.setContent(rs.getString("content"));
			comments.setTime(rs.getTimestamp("time"));
			list.add(comments);
		}
		return list;
	}
}

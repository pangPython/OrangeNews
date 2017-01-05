package cn.edu.bzu.group12.orangenews.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.bzu.group12.orangenews.bean.CommentsAndUser;


/**
 * @author pangPython
 *	操作评论+用户名
 *
 */
public class CommentsAndUserDao extends BaseDao{

	@Override
	Object RS2Obj(ResultSet rs, Object obj) throws SQLException {
		
		CommentsAndUser cau = (CommentsAndUser)obj;
		cau.setComments_id(rs.getInt("comments_id"));
		cau.setUser_name(rs.getString("user_name"));
		cau.setContent(rs.getString("content"));
		cau.setNews_id(rs.getInt("news_id"));
		cau.setTime(rs.getTimestamp("time"));
		
		return cau;
	}
	
	public List<CommentsAndUser> getCmtsAndUserNameByNId(int news_id) throws SQLException {
		String sql = "SELECT u.user_name user_name,c.comments_id,c.news_id,c.content content,c.time TIME FROM USER u,comments c WHERE u.user_id=c.user_id and news_id = "+news_id;
		List<CommentsAndUser> list = new ArrayList<CommentsAndUser>();
		ResultSet rs = this.getStat().executeQuery(sql);
		while (rs.next()) {
			list.add((CommentsAndUser) RS2Obj(rs, new CommentsAndUser()));
		}
		return list;
	}
	

}

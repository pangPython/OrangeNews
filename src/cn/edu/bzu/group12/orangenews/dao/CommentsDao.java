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
			list.add((Comments) RS2Obj(rs,new Comments()));
		}
		return list;
	}
	
	//根据用户id获取评论
	public List<Comments> getCmtsByUId(int user_id) throws SQLException{
		String sql = "select * from comments where user_id = "+user_id;
		List<Comments> list = new ArrayList<Comments>();
		ResultSet rs = this.getStat().executeQuery(sql);
		while (rs.next()) {
			list.add((Comments) RS2Obj(rs,new Comments()));
		}
		return list;
	}

	//继承自BaseDao的抽象方法 
	//把数据库查询的ResultSet转换成Comments对象
	@Override
	Object RS2Obj(ResultSet rs, Object obj) throws SQLException {
		Comments comments = (Comments)obj;
		comments.setComments_id(rs.getInt("comments_id"));
		comments.setNews_id(rs.getInt("news_id"));
		comments.setUser_id(rs.getInt("user_id"));
		comments.setContent(rs.getString("content"));
		comments.setTime(rs.getTimestamp("time"));
		return comments;
	}
	
	//根据新闻id获取评论
	public List<Comments> getCmtsByNId(int news_id) throws SQLException {
		String sql = "select * from comments where news_id = "+news_id;
		List<Comments> list = new ArrayList<Comments>();
		ResultSet rs = this.getStat().executeQuery(sql);
		while (rs.next()) {
			list.add((Comments) RS2Obj(rs, new Comments()));
		}
		return list;
	}

		//添加新闻评论
		//@author 许桓彩
		public boolean addComments(int news_id,int user_id,String content) throws SQLException
		{
			String sql = "insert into comments(news_id,user_id,content) values("+news_id+","+user_id+",'"+content+"')";
			System.out.println(sql);
			
			if(this.getStat().executeUpdate(sql)>0){
				
				return true;
				
			}
			return false;
		}

	
	
}

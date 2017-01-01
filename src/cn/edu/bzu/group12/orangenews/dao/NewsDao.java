package cn.edu.bzu.group12.orangenews.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.bzu.group12.orangenews.bean.News;


/**
 * @author pangPython
 *	新闻表数据库操作
 */
public class NewsDao extends BaseDao{
	//根据id查新闻
	public News getById(int news_id) throws SQLException{
		String sql = "select * from news where news_id = '"+news_id+"'";
		ResultSet rs = this.getStat().executeQuery(sql);
		News n= new News();
		while (rs.next()) {
			n.setNews_id(rs.getInt("news_id"));
			n.setTitle(rs.getString("title"));
			n.setContent(rs.getString("content"));
			n.setAuthor(rs.getString("author"));
			n.setType(rs.getInt("type"));
			n.setSummary(rs.getString("summary"));
			n.setCreate_date(rs.getDate("create_date"));
		}
		return n;
	}
	
	//获取某个类型的全部新闻
	public List<News> OneTypeAllNews(int type_id) throws SQLException{
		String sql = "select * from news where type='"+type_id+"' limit 20;";
		ResultSet rs = this.getStat().executeQuery(sql);
		List<News> list = new ArrayList<News>();
		while(rs.next()){
			News n= new News();
			n.setNews_id(rs.getInt("news_id"));
			n.setTitle(rs.getString("title"));
			n.setContent(rs.getString("content"));
			n.setAuthor(rs.getString("author"));
			n.setType(rs.getInt("type"));
			n.setSummary(rs.getString("summary"));
			n.setCreate_date(rs.getDate("create_date"));
			list.add(n);
		}
		return list;
	}
	//查询特定类型的3条最新新闻
	public List<News> get3TypeNews(int type_id) throws SQLException{
		String sql = "select * from news where type='"+type_id+"' limit 3;";
		
		ResultSet rs = this.getStat().executeQuery(sql);
		List<News> list = new ArrayList<News>();
		while(rs.next()){
			News n= new News();
			n.setNews_id(rs.getInt("news_id"));
			n.setTitle(rs.getString("title"));
			n.setContent(rs.getString("content"));
			n.setAuthor(rs.getString("author"));
			n.setType(rs.getInt("type"));
			n.setSummary(rs.getString("summary"));
			n.setCreate_date(rs.getDate("create_date"));
			list.add(n);
		}
		return list;
	}
	
	//获取所有新闻
	public List<News> getAllNews() throws SQLException{
		String sql = "SELECT * FROM News WHERE title != '' LIMIT 20";
		ResultSet rs = this.getStat().executeQuery(sql);
		List<News> list = new ArrayList<News>();
		while(rs.next()){
			News n= new News();
			n.setNews_id(rs.getInt("news_id"));
			n.setTitle(rs.getString("title"));
			n.setContent(rs.getString("content"));
			n.setAuthor(rs.getString("author"));
			n.setType(rs.getInt("type"));
			n.setSummary(rs.getString("summary"));
			n.setCreate_date(rs.getDate("create_date"));
			list.add(n);
		}
		return list;
	}
	//根据id查类型名称
	public String getNameById(int type_id) throws SQLException{
		String sql = "SELECT name FROM type WHERE type_id='"+type_id+"'";
		ResultSet rs = this.getStat().executeQuery(sql);
		String type_name = null;
		while (rs.next()) {
			type_name = rs.getString("name");
		}
		return type_name;
	}

	@Override
	Object RS2Obj(ResultSet rs, Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}

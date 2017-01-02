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
			n = (News) RS2Obj(rs, new News());
		}
		return n;
	}
	
	//根据id查类型名称

		public String getNameById(int id) throws SQLException{
			String type="";
			if(id>=1&&id<=6){
				String sql = "SELECT name FROM type WHERE type_id='"+id+"'";
				ResultSet rs=this.getStat().executeQuery(sql);
				rs.next();
				type = rs.getString("name");
			}
			else
			{
				type="其他";
			}
			return type;
		}
	
	//根据板块代码查询该板块页数（每页20条数据）
		public int getPage(int type) throws Exception{
			int p=0;
			String sql="";
			if(type>=1&&type<=6){
				sql = "SELECT COUNT(*) as num FROM news WHERE TYPE='"+type+"'";
			}
			else{
				sql="SELECT COUNT(*) as num FROM news WHERE TYPE !=1 AND TYPE!=2 AND TYPE!=3 AND TYPE!=4 AND TYPE !=5 AND TYPE!=6";
			}
		
			ResultSet rs = this.getStat().executeQuery(sql);
			rs.next();
			int num = rs.getInt("num");
			p=num%20==0?num/20:num/20+1;
			return p;
		}
	
	//获取某个类型的全部新闻
	public List<News> OneTypeAllNews(int type_id) throws SQLException{
		String sql = "select * from news where type='"+type_id+"' limit 20;";
		ResultSet rs = this.getStat().executeQuery(sql);
		List<News> list = new ArrayList<News>();
		while(rs.next()){
			list.add((News) RS2Obj(rs, new News()));
		}
		return list;
	}
	//查询特定类型的3条最新新闻
	public List<News> get3TypeNews(int type_id) throws SQLException{
		String sql = "select * from news where type='"+type_id+"' limit 3;";
		
		ResultSet rs = this.getStat().executeQuery(sql);
		List<News> list = new ArrayList<News>();
		while(rs.next()){
			list.add((News) RS2Obj(rs, new News()));
		}
		return list;
	}
	
	//获取所有新闻
	public List<News> getAllNews() throws SQLException{
		String sql = "SELECT * FROM News WHERE title != '' LIMIT 20";
		ResultSet rs = this.getStat().executeQuery(sql);
		List<News> list = new ArrayList<News>();
		while(rs.next()){
			list.add((News) RS2Obj(rs, new News()));
		}
		return list;
	}


	@Override
	Object RS2Obj(ResultSet rs, Object obj) throws SQLException {
		News n= (News) obj;
		n.setNews_id(rs.getInt("news_id"));
		n.setTitle(rs.getString("title"));
		n.setContent(rs.getString("content"));
		n.setAuthor(rs.getString("author"));
		n.setType(rs.getInt("type"));
		n.setSummary(rs.getString("summary"));
		n.setCreate_date(rs.getDate("create_date"));
		n.setHits(rs.getInt("hits"));
		return n;
	}
	
	//查询板块热点新闻前20条
	public List<News> getTHotNews(int tp) throws SQLException {
		String sql="";
		if(tp>=1&&tp<=6){
			sql = "SELECT * FROM news where type='"+tp+"' ORDER BY hits DESC LIMIT 20";
		}
		else
		{
			sql="SELECT * FROM news WHERE TYPE !=1 AND TYPE!=2 AND TYPE!=3 AND TYPE!=4 AND TYPE !=5 AND TYPE!=6 ORDER BY hits DESC LIMIT 20";
		}
		
		ResultSet rs=this.getStat().executeQuery(sql);
		List<News> list = new ArrayList<News>();
		while(rs.next()){
			list.add((News) RS2Obj(rs, new News()));
		}
		return list;
	}

	public List<News> getHotNews() throws SQLException {
		String sql = "SELECT * FROM news ORDER BY hits DESC LIMIT 20";
		ResultSet rs=this.getStat().executeQuery(sql);
		List<News> list = new ArrayList<News>();
		while(rs.next()){
			list.add((News) RS2Obj(rs, new News()));
		}
		return list;
	}
	//
	public List<News> OneTypeAllNews(int type_id, int pg) throws SQLException {
		String sql="";
		if(type_id>=1&&type_id<=6){
			sql="SELECT * FROM(SELECT * FROM(SELECT * FROM news WHERE TYPE = '"+type_id+"' LIMIT "+20*pg+") AS n ORDER BY news_id DESC LIMIT 20) AS nn ORDER BY news_id ASC";
		}
		else{
			sql="SELECT * FROM(SELECT * FROM(SELECT * FROM news WHERE TYPE !=1 AND TYPE!=2 AND TYPE!=3 AND TYPE!=4 AND TYPE !=5 AND TYPE!=6 LIMIT "+20*pg+") AS n ORDER BY news_id DESC LIMIT 20) AS nn ORDER BY news_id ASC";
		}
		ResultSet rs = this.getStat().executeQuery(sql);
		List<News> list = new ArrayList<News>();
		while(rs.next()){
			list.add((News) RS2Obj(rs, new News()));
		}
		return list;
	}
	
}

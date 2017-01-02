package cn.edu.bzu.group12.orangenews.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.edu.bzu.group12.orangenews.bean.News;
import cn.edu.bzu.group12.orangenews.dao.BaseDao;
import cn.edu.bzu.group12.orangenews.dao.NewsDao;

/**
 * @author ChengRui 新闻的业务逻辑
 */
public class NewsService {
	NewsDao newsDao = new NewsDao();

	// 获取一个新闻
	public News getOneNews(int news_id) throws Exception {
		return newsDao.getById(news_id);
	}

	// 获取某个类型的全部新闻
	public List<News> getTypeNews(int type_id) throws Exception {
		return newsDao.OneTypeAllNews(type_id);
	}

	// 查询3条特定类型的最新新闻-相关新闻
	public List<News> get3TypeNews(int type_id) throws Exception {
		return newsDao.get3TypeNews(type_id);
	}

	// 获取所有新闻
	public List<News> getAllNews() throws Exception {
		return newsDao.getAllNews();
	}

	// 根据类型id查类型名称
	public String SelectType(int type_id) throws Exception {
		return newsDao.getNameById(type_id);
	}

	// 查询热点新闻前20条
	public List<News> getHotNews() throws Exception {
		return newsDao.getHotNews();
	}

	// 查询板块热点新闻前20条
	public List<News> getTHotNews(int tp) throws SQLException {
		return newsDao.getTHotNews(tp);
	}

	public List<News> getTypeNews(int num, int pg) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPage(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}

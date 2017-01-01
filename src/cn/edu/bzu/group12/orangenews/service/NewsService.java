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
 * @author ChengRui
 *	���ŵ�ҵ���߼�
 */
public class NewsService {
		NewsDao newsDao = new NewsDao();
	
		//��ȡһ������
	public News getOneNews(int news_id) throws Exception{
		return newsDao.getById(news_id);
	}

	//��ȡĳ�����͵�ȫ������
	public List<News> getTypeNews(int type_id) throws Exception{
		return newsDao.OneTypeAllNews(type_id);
	}
	
	//��ѯ3���ض����͵���������-�������
	public List<News> get3TypeNews(int type_id) throws Exception{
		return newsDao.get3TypeNews(type_id);
	}
	//��ȡ��������
	public List<News> getAllNews() throws Exception{
		return newsDao.getAllNews();
	}
	//��������id����������
	public String SelectType(int type_id) throws Exception{
		return newsDao.getNameById(type_id);
	}
	

}

package cn.edu.bzu.group12.orangenews.service;

import java.sql.SQLException;
import java.util.List;

import cn.edu.bzu.group12.orangenews.bean.News;
import cn.edu.bzu.group12.orangenews.dao.NewsDao;

/**
 * @author ChengRui ���ŵ�ҵ���߼�
 */
public class NewsService {
	NewsDao newsDao = new NewsDao();

	// ��ȡһ������
	public News getOneNews(int news_id) throws Exception {
		return newsDao.getById(news_id);
	}

	// ��ȡĳ�����͵�ȫ������
	public List<News> getTypeNews(int type_id) throws Exception {
		return newsDao.OneTypeAllNews(type_id);
	}

	// ��ѯ3���ض����͵���������-�������
	public List<News> get3TypeNews(int type_id) throws Exception {
		return newsDao.get3TypeNews(type_id);
	}

	// ��ȡ��������
	public List<News> getAllNews() throws Exception {
		return newsDao.getAllNews();
	}

	// ��������id����������
	public String SelectType(int type_id) throws Exception {
		return newsDao.getNameById(type_id);
	}

	// ��ѯ�ȵ�����ǰ20��
	public List<News> getHotNews() throws Exception {
		return newsDao.getHotNews();
	}

	// ��ѯ����ȵ�����ǰ20��
	public List<News> getTHotNews(int tp) throws SQLException {
		return newsDao.getTHotNews(tp);
	}

	public List<News> getTypeNews(int type_id, int pg) throws SQLException {
		return newsDao.OneTypeAllNews(type_id,pg);
	}

	public int getPage(int type_id) throws Exception {
		return newsDao.getPage(type_id);
	}

}

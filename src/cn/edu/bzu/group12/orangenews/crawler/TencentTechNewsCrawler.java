package cn.edu.bzu.group12.orangenews.crawler;

import java.sql.SQLException;
import java.util.Random;

import cn.edu.bzu.group12.orangenews.bean.News;
import cn.edu.bzu.group12.orangenews.dao.NewsDao;
import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;


/**
 * @author pangPython
 *	��ȡ��Ѷ���ſƼ����
 *
 */

public class TencentTechNewsCrawler extends BreadthCrawler {

	//ʵ�������ݿ����
	NewsDao newsDao = new NewsDao();
	
	//���췽��
	public TencentTechNewsCrawler(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);
		//Ŀ����ַ����ȡ�����
		this.addSeed("http://tech.qq.com/");
		//����������URL������ʽ��ʽ
		this.addRegex("http://tech.qq.com/.*");
	}

	//ƥ�䵽Ŀ��URLʱ�Ĳ���
	public void visit(Page page, CrawlDatums cd) {
		//���ű���
		String title = page.select("div[class=hd]").text();
		//��������
		String content = page.select("div[id=Cnt-Main-Article-QQ]").text();
		//ժҪ
		String summary = content.substring(0, content.length()/10);
		//��������
		String author = page.select("div[id=QQeditor]").text();
		
		
		News news = new News();
		news.setTitle(title);
		news.setSummary(summary);
		news.setContent(content);
		news.setAuthor(author);
		//��������������
		news.setHits(new Random().nextInt());
		//��������1��6�������
		news.setType((new Random().nextInt()+1)%6);
		try {
			newsDao.insert(news);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		//ʵ����һ���������� ��һ�����������������ļ����·�����ڶ���������
		TencentTechNewsCrawler ttnc = new TencentTechNewsCrawler("qqtechnews", true);
		//�����߳���
		ttnc.setThreads(50);
		ttnc.setTopN(5000);
		ttnc.start(4);
		
	}

}

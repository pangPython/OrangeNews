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
 *	爬取腾讯新闻科技版块
 *
 */

public class TencentTechNewsCrawler extends BreadthCrawler {

	//实例化数据库操作
	NewsDao newsDao = new NewsDao();
	
	//构造方法
	public TencentTechNewsCrawler(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);
		//目标网址，爬取的入口
		this.addSeed("http://tech.qq.com/");
		//符合条件的URL正则表达式形式
		this.addRegex("http://tech.qq.com/.*");
	}

	//匹配到目标URL时的操作
	public void visit(Page page, CrawlDatums cd) {
		//新闻标题
		String title = page.select("div[class=hd]").text();
		//新闻内容
		String content = page.select("div[id=Cnt-Main-Article-QQ]").text();
		//摘要
		String summary = content.substring(0, content.length()/10);
		//新闻作者
		String author = page.select("div[id=QQeditor]").text();
		
		
		News news = new News();
		news.setTitle(title);
		news.setSummary(summary);
		news.setContent(content);
		news.setAuthor(author);
		//点击量设置随机数
		news.setHits(new Random().nextInt());
		//类型设置1到6的随机数
		news.setType((new Random().nextInt()+1)%6);
		try {
			newsDao.insert(news);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		//实例化一个新闻爬虫 第一个参数是爬虫数据文件存放路径，第二个参数是
		TencentTechNewsCrawler ttnc = new TencentTechNewsCrawler("qqtechnews", true);
		//设置线程数
		ttnc.setThreads(50);
		ttnc.setTopN(5000);
		ttnc.start(4);
		
	}

}

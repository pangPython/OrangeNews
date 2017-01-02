package cn.edu.bzu.group12.orangenews.bean;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author pangPython
 *		新闻评论实体类
 *
 */
public class Comments {
	
	private int comments_id;
	private int news_id;
	private int user_id;
	private String content;
	private Timestamp time;
	
	public int getComments_id() {
		return comments_id;
	}
	public void setComments_id(int comments_id) {
		this.comments_id = comments_id;
	}
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}

	
	
	
}

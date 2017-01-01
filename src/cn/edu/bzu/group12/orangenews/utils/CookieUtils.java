package cn.edu.bzu.group12.orangenews.utils;

import javax.servlet.http.Cookie;



/**
 * @author pangPython
 *	Cookie工具类
 */
public class CookieUtils {
	//从cookie数组中获取指定key的cookie
	public static Cookie getCookieFromCookies(Cookie[] cookies,String target){
		Cookie cookie = null;
		for (int i = 0; i < cookies.length; i++) {
			if(cookies[i].getName().equals(target)){
				cookie = cookies[i];
			}
		}
		
		return cookie;
	}
}

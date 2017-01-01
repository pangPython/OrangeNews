package cn.edu.bzu.group12.orangenews.utils;

import javax.servlet.http.Cookie;



/**
 * @author pangPython
 *	Cookie������
 */
public class CookieUtils {
	//��cookie�����л�ȡָ��key��cookie
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

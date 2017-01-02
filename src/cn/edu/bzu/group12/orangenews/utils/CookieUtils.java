package cn.edu.bzu.group12.orangenews.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



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
	//ɾ������cookie
	public static void removeAllCookies(HttpServletRequest req,HttpServletResponse resp){
			Cookie[] cookies = req.getCookies();
			for(Cookie cookie: cookies){
				cookie.setMaxAge(0);
				cookie.setPath("/");
				resp.addCookie(cookie);
			}
	}
	
	public static void removeCookieByName(String cookie_name,HttpServletRequest request,HttpServletResponse resp){
		Cookie cookie = null;
		   Cookie[] cookies = null;
		   // ��ȡ��ǰ�����µ�cookies����һ������
		   cookies = request.getCookies();
		   if( cookies != null ){
		      for (int i = 0; i < cookies.length; i++){
		         cookie = cookies[i];
		         if((cookie.getName()).compareTo(cookie_name) == 0 ){
		            cookie.setMaxAge(0);
		            resp.addCookie(cookie);
		         }
		      }
		   }
	}
	
}

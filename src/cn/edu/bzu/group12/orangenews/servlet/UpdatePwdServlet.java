package cn.edu.bzu.group12.orangenews.servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.bzu.group12.orangenews.service.UserService;
import cn.edu.bzu.group12.orangenews.utils.CookieUtils;

/**
 * @author pangPython
 *	用户修改密码
 */
public class UpdatePwdServlet extends HttpServlet {
	
	UserService userService = new UserService(); 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//旧密码
		String old_pwd = (((HttpServletRequest)req).getParameter("old_pwd")).toString();
		System.out.println(old_pwd);
		//新密码
		String new_pwd = (((HttpServletRequest)req).getParameter("new_pwd")).toString();
		//确认密码
		String confirm_pwd = (((HttpServletRequest)req).getParameter("confirm_pwd")).toString();
		//进行验证
		if(!new_pwd.equals(confirm_pwd)){
			//新旧密码不匹配
			req.setAttribute("info", "新旧密码不匹配");
			req.setAttribute("target", "updatepwd.jsp");
			req.getRequestDispatcher("redirect.jsp").forward(req, res);
		}
		//获取用户id
		int  user_id = Integer.parseInt(CookieUtils.getCookieFromCookies(((HttpServletRequest)req).getCookies(), "loginuser").getValue());
		//更新密码
		try {
			if(userService.updatepwd(user_id, new_pwd)){
				req.setAttribute("info", "密码更新成功，正在返回上一页！");
				req.setAttribute("target", "updatepwd.jsp");
				req.getRequestDispatcher("redirect.jsp").forward(req, res);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}

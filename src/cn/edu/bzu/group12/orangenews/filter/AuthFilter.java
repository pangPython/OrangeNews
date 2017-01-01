package cn.edu.bzu.group12.orangenews.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * @author pangPython
 *  页面权限过滤器
 */
public class AuthFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest servletReq, ServletResponse servletRsp,
			FilterChain filterCha) throws IOException, ServletException {
		
//		if ("admin".equals(servletReq.getAttribute("name"))) {
//			PrintWriter out = servletRsp.getWriter();
//			out.println("欢迎管理员！");
//			out.flush();
//			out.close();
//		}
		/*PrintWriter out = servletRsp.getWriter();
		out.println(servletReq.getProtocol());
		out.flush();
		out.close();*/
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}

package cn.edu.bzu.group12.pangpython.filter;

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
 *  ҳ��Ȩ�޹�����
 */
public class AuthFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest servletReq, ServletResponse servletRsp,
			FilterChain filterCha) throws IOException, ServletException {
		
//		if ("admin".equals(servletReq.getAttribute("name"))) {
//			PrintWriter out = servletRsp.getWriter();
//			out.println("��ӭ����Ա��");
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

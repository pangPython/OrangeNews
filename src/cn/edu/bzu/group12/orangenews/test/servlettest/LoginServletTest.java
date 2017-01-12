package cn.edu.bzu.group12.orangenews.test.servlettest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import cn.edu.bzu.group12.orangenews.servlet.LoginServlet;

/**
 * @author pangPython
 *	使用Junit4 EasyMock3.4 测试登录 
 */
public class LoginServletTest {
	
	private LoginServlet loginServlet;
	private HttpServletRequest mockRequest;
	private HttpServletResponse mockResponse;
	private ServletContext mockServletContext;
	private RequestDispatcher mockDispatcher;
	
	
	/**
	 * 
	 */
	@Before
	public void  setUp() {
		mockRequest = EasyMock.createMock(HttpServletRequest.class);
		mockResponse = EasyMock.createMock(HttpServletResponse.class);
		mockServletContext = EasyMock.createMock(ServletContext.class);
		mockDispatcher = EasyMock.createMock(RequestDispatcher.class);
		
		
		loginServlet = new LoginServlet(){
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public ServletContext getServletContext(){
				return mockServletContext;
			}
			
		};
		
		
	}
	
	//测试方法
	@Test
	public void  loginSuccess() throws ServletException, IOException {
		EasyMock.expect(mockRequest.getParameter("user_name")).andReturn("admin").times(1);
		EasyMock.expect(mockRequest.getParameter("user_pwd")).andReturn("111").times(1);
		EasyMock.expect(mockServletContext.getRequestDispatcher("/error.jsp")).andReturn(mockDispatcher).times(1);
		mockDispatcher.forward(mockRequest, mockResponse);
		EasyMock.expectLastCall();
		EasyMock.replay(mockRequest,mockServletContext,mockDispatcher);
		loginServlet.service(mockRequest, mockResponse);
		EasyMock.verify(mockDispatcher);
	}
	
	@Test
	public void loginFail() {
		
	}
	
	
	
}

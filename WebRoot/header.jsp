<%@page import="org.apache.log4j.Logger"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!-- header-section-starts -->
	<div class="header">
		<div class="container">
			<div class="logo">
				<a href="ShowAllServlet"><h1>ORANGE</h1></a>
			</div>
			<div class="pages">
				<ul>
					<li><a class="active" href="ShowAllServlet">首页</a></li>
					<li><a>板块</a></li>
					<li><a href="404.jsp">Tutorials</a></li>
				</ul>
			</div>
			<div class="navigation">
				<ul>
						<%
					Cookie user_id = null;
					try{
					Cookie[] cookies = request.getCookies();
					System.out.println("获取了Cookies！");
					//获取cookie
					if(cookies!=null){
						for(int i =0;i<cookies.length;i++){
							if(cookies[i].getName().equals("loginuser")){
								user_id = cookies[i];
								System.out.println("获取到了用户Cookies！"+user_id.getValue());
							}
						}
					}
					}catch(Exception e) {
					
						System.out.println("没有获取到cookie");
						request.getRequestDispatcher("/").forward(request, response);
						
					}
					
					try{
						System.out.println("正在查看是否有此用户");
					//判断服务器端session是否存在当前用户id
					if(session.getAttribute(user_id.getValue())!=null){
						System.out.println("获取到了用户session");
						%>
						
					<li><a href="usercenter">用户中心</a></li>
					<li><a href="mymessage.jsp">我的消息</a></li>
					<li><a class="active" href="logout">退出</a></li>
						<%
					}else{
					%>
					<li><a href="login.jsp">登录</a></li>
					<li><a href="register.jsp">注册</a></li>
					<%
					}
					 
					}catch(Exception e){
					%>
					<li><a href="login.jsp">登录</a></li>
					<li><a href="register.jsp">注册</a></li>
					<%
					}
					
					System.out.println("离开header！");
						%>
					
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
<%@page import="cn.edu.bzu.group12.orangenews.bean.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <% 
    	List<User> list = (List)request.getAttribute("userList");
    %>
    
    <table border="1" cellspacing="0px" cellpadding="50px">
    	<% for(int i = 0;i<list.size();i++){
    	%>
    		<tr>
    			<td>
    			<%
    			out.print(list.get(i).getUser_name());
    			
    			%>
    			<img alt="1243" src="static/img/1.jpg" width="100px">
    			</td>
    		</tr>
    	<%
    	} 
    	%>
    	
    </table>
    
  </body>
</html>

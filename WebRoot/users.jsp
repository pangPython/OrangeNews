<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="php" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'users.jsp' starting page</title>
    
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
    	<table border="1" cellpadding="50px" cellspacing="0">
		    <php:forEach items="${users}" var="user">
    			<tr>
    				<td><a href="edituser?uid=${user.user_id}">编辑</a></td>
    				<td>${user.user_id}</td>
    				<td>${user.user_name}</td>
    				<td>${user.user_sex}</td>
    				<td>${user.tel}</td>
    				<td>${user.email}</td>
    				<td><img src="${user.pic }" width="100"></td>
    			</tr>
    		</php:forEach>
    	</table>
  </body>
</html>
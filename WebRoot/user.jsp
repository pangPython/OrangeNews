<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="hello" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user.jsp' starting page</title>
    
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
    <form action="">
    <table>
    		<tr>
	    		<td>id:<input type="text" value="${user.user_id}" name="user_id"></td>
    		</tr>
    		<tr>
    			<td>姓名：<input type="text" value="${user.user_name}" name="user_name"></td>
    		</tr>
    		<tr>
    			<td>性别：<input type="text" value="${user.user_sex }" name="user_sex"></td>
    		</tr>
    		<tr>
    			<td>密码：<input type="text" value="${user.pwd}" name="user_pwd"></td>
    		</tr>
    		<tr>
    			<td>手机：<input type="text" value="${user.tel}" name="user_tel"></td>
    		</tr>
    		<tr>
    			<td>邮件：<input type="text" value="${user.email}" name="user_email"></td>
    		</tr>
    		<tr><td><input type="submit"></td></tr>
    </table>
    </form>
  </body>
</html>

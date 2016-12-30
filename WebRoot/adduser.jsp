<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adduser.jsp' starting page</title>
    
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
  <h1>添加用户</h1>
   <form action="useradd" method="post"> 
   	<table border="1" cellspacing="0" cellpadding="20px">
		<tr>
			<td>用户名</td>
			<td>
				<input type="text" name="user_name">
			</td>
		</tr>
		<tr>
			<td>密码</td>
			<td>
				<input type="password" name="pwd">
			</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>
				<select name="sex">
					<option value="1">男</option>
					<option value="0">女</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>手机号</td>
			<td>
				<input type="text" name="tel">
			</td>
		</tr>
		<tr>
			<td>邮件</td>
			<td>
				<input type="text" name="email">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit">
			</td>
		</tr>
   	</table>
   </form>
  </body>
</html>

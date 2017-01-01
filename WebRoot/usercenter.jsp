<%@page import="cn.edu.bzu.group12.orangenews.bean.User"%>
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
    
    <title>用户中心</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="static/css/normalize.css">
	<link href="static/css/style.css" rel="stylesheet" type="text/css" media="all" />
  	<script type="text/javascript" src="static/js/jquery-1.11.1.min.js"></script>
  	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
  </head>
  <body>
  <%@ include file="header.jsp" %>
	<div class="container">
		<br><br><br>
		<div class="row">
			<table class="table table-bordered">
				<tr>
					<td colspan="2"><h1>用户中心</h1></td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td>${user.user_name}</td>
				</tr>
				<tr>
					<td>性别：</td>
					<td>${user.user_sex }</td>
				</tr>
				<tr>
					<td>密码：</td>
					<td>${user.pwd}</td>
				</tr>
				<tr>
					<td>手机：</td>
					<td>${user.tel}</td>
				</tr>
				<tr>
					<td>邮件：</td>
					<td>${user.email}</td>
				</tr>
			</table>
		</div>
		<div class="row">
			<table class="table table-bordered">
				<tr>
					<td><a href="edituser?uid=${user.user_id }" class="btn btn-success">修改信息</a></td>
					<td><a href="updatepwd?uid=${user.user_id }" class="btn btn-success">修改密码</a></td>
					<td><a href="mycomments?uid=${user.user_id }" class="btn btn-success">我的评论</a></td>
				</tr>				
			</table>
		</div>
	</div>
</body>
   <script type="text/javascript" src="static/js/bootstrap.min.js"></script>
</html>

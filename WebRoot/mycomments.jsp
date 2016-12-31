<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我的评论</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="static/css/normalize.css">

  </head>
  
  <body>
  	<div class="container">
  		<div class="text-center">
  			<h1>我的新闻评论</h1>
  		</div>
  		<div class="row">
  			<table class="table table-bordered">
	    <c:forEach items="${newslist }" var="news">
			<tr>
				
				<td>内容：${news.content}</td>
				<td>时间：${news.time}</td>
			</tr>	    	
	    </c:forEach>
  	</table>
  				
  		</div>
  	</div>
  	  </body>
  <script type="text/javascript" src="static/js/bootstrap.min.js"></script>
</html>

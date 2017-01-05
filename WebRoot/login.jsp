<%@page import="cn.edu.bzu.group12.orangenews.utils.CookieUtils"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//删除cookie
CookieUtils.removeCookieByName("loginuser",request,response);

%>

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">   
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="static/css/normalize.css">
	<link href="static/css/style.css" rel="stylesheet" type="text/css" media="all" />
  	<script type="text/javascript" src="static/js/jquery-1.11.1.min.js"></script>
  	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
  </head>
  
  <body>
  	<%@ include file="header.jsp"%>
  <div class="wai">
	<div class="container22">
		<br><br><br>
		<div class="row22">
			<form action="login" id="form" method="post">
			
			<table class="table table-bordered text-center" >
				<tr><td colspan="2"><h1 >登录</h1></td></tr>
				<tr>
					<td>用户名</td>
					<td>
						<input type="text" name="user_name">
					</td>
				</tr>
				<tr>
					<td>密码</td>
					<td>
						<input type="password" name="user_pwd">
					</td>
				</tr>
				<tr>
					<td colspan="2" class="text-center">
						<button type="button" class="btn btn-success" onclick="login()">登录</button>
						<a class="btn btn-success" href="register.jsp">注册</a>
					</td>
				</tr>
			</table>
			</form>
		</div>
		
	</div>
	</div>
  </body>
  <script type="text/javascript" src="static/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  	function login(){
  		document.getElementById("form").submit();
  	}
  </script>
</html>

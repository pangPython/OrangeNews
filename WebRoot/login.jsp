<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
					<li><a href="contact.jsp">Advertise</a></li>
					<li><a href="about.jsp">About Us</a></li>
					<li><a class="active" href="contact.jsp">Contact Us</a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<div class="container">
		<br><br><br>
		<div class="row">
			<form action="login" id="form" method="post">
			
			<table class="table table-bordered text-center" style="width:60%">
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
						<a href="register.jsp">点击注册</a>
					</td>
				</tr>
			</table>
			</form>
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

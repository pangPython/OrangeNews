<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改密码</title>
    
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
   			<form action="updatepwd" method="post">
   			<table class="table table-bordered">
   				<tr>
   					<td colspan="2">
   						<h1>更新密码</h1>
   					</td>
   				</tr>
   				<tr>
   					<td>旧密码</td>
   					<td>
   						<input type="password" name="old_pwd" class="input">
   					</td>
   				</tr>
   				<tr>
   					<td>新密码</td>
   					<td>
   						<input type="password" name="new_pwd" class="input">
   					</td>
   				</tr>
   				<tr>	
   					<td>确认密码</td>
   					<td>
   						<input type="password" name="confirm_pwd" class="input">
   					</td>
   				</tr>
   				<!-- <tr>
   					<td>验证码</td>
   					<td>
   						<input type="password"  class="input">
   					</td>
   				</tr> -->
   				<tr>
   					<td colspan="2">
   						<input class="btn btn-success" type="submit">
   					</td>
   				</tr>
   			</table>
   			</form>
   		</div>
   	</div>
  </body>
</html>

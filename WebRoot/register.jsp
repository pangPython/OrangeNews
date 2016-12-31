<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
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
  		<div class="row">
			<h1>注册</h1>
			<form action="register" method="post">
				<table class="table" >
					<tr>
						<td>用户名</td>
						<td><input type="text" name="user_name"></td>
					</tr>
					<tr>
						<td>密码</td>
						<td><input type="password" name="pwd"></td>
					</tr>
					<tr>
						<td>确认密码</td>
						<td><input type="password" name="confirm_pwd"></td>
					</tr>
					<tr>
						<td>性别</td>
						<td><select name="sex">
								<option value="1">男</option>
								<option value="0">女</option>
						</select></td>
					</tr>
					<tr>
						<td>手机号</td>
						<td><input type="text" name="tel"></td>
					</tr>
					<tr>
						<td>邮件</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td colspan="2" class="text-center">
							<input class="btn btn-success" type="submit">
						</td>
					</tr>
				</table>
			</form>
		</div>
  	</div>
  </body>
</html>

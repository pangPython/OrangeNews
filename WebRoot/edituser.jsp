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
    
    <title>编辑用户信息</title>
    
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
   					<td colspan="2"><h1>编辑信息</h1></td>
   				</tr>
   			
    		<tr>
    			<td>姓名：</td>
    			<td><input type="text" value="${user.user_name}" name="user_name"></td>
    		</tr>
    		<tr>
    			<td>性别：</td>
    			<td>
    				<select name="user_sex">
    					<option value="${user.user_sex }">
						 	<c:if test=" ${user.user_sex=='0' } ">
						 	女
						 	</c:if>
						 	<c:if test=" ${user.user_sex=='1' }">
						 	男
						 	</c:if>
    					</option>
    					
    					<option value="${1-user.user_sex }">
						 	<c:if test=" ${user.user_sex=='1'}">
						 		女
						 	</c:if>
						 	<c:if test=" ${user.user_sex=='0'}">
						 		男
						 	</c:if>
    					</option>
    				</select>
    				<input type="text" value="${user.user_sex }" name="user_sex">
    			</td>
    		</tr>
    	
    		<tr>
    			<td>手机：</td>
    			<td><input type="text" value="${user.tel}" name="user_tel"></td>
    		</tr>
    		<tr>
    			<td>邮件：</td>
    			<td><input type="text" value="${user.email}" name="user_email"></td>
    		</tr>
	    		<tr>
	    			<td colspan="2" class="text-center">
	    				<input class="btn btn-success" type="submit">
	    			</td>
	    		</tr>
	   			</table>
   		</div>
   	</div>
  </body>
  <script type="text/javascript" src="static/js/bootstrap.min.js"></script>
</html>

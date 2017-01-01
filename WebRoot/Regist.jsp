              <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Regist.jsp' starting page</title>
    
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
  <form style="margin-left: 500px">
    <p style="font-size: 30px">用户信息</p>
    <table style="font-size: 20px">
    	<tr>
    		<td>用户名:
    			<input type="text" style="font-size: 20px"/>
    		</td>
    	</tr>
    <tr>
    		<td>密&nbsp;&nbsp;&nbsp;码:
    			<input type="password" style="font-size: 20px"/>
    		</td>
    	</tr>
    <tr>
    		<td>手机号:
    			<input type="text" style="font-size: 20px"/>
    		</td>
    	</tr>
    	<tr>
    		<td>邮&nbsp;&nbsp;&nbsp;箱:
    			<input type="text" style="font-size: 20px" />
    		</td>
    	</tr>
    	
    	
    
    
    
    </table>
    </br>
    			<input type="reset" value="注册" name="rst"/>
    			<input type="button" value="返回" name="btn"/>
    
    </form>
    
  </body>
</html>

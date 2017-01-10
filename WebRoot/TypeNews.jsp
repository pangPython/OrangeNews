<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>

<head>

<title>版块</title>
<link href="static/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="static/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<script src="static/js/jquery-1.11.1.min.js"></script>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Konstructs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
<body>
<input class="top" type="hidden"/>
<div class="backtop">
<a href="#top"><img src="static/images/backtop.png"></a>
</div>
	<%@ include file="header.jsp" %>
	<%@ include file="nav.jsp" %>
	<div class="container">
		<div class="content">
			<div class="col-md-7 printing-content">
				<div class="print-main">
				<c:forEach items="${tpnews }" var ="tp">
					<h3>${ tp.title}</h3>
					<a href="ShowOneServlet?id=${tp.news_id }">${tp.summary }</a>
					<p class="sub_head">${tp.author } ${tp.create_date }</p>
					<a href="ShowOneServlet?id=${tp.news_id }"><img src="static/images/print.jpg" class="img-responsive"  /></a>
					<p  class="sub_head"><a href="ShowOneServlet?id=${tp.news_id }">查看详情>></a></p>
				<hr/>
				</c:forEach>
				第
				<%
				//tp:板块代码,p:总页码
				int tp = Integer.parseInt(request.getAttribute("tyn").toString()); 
				int p = Integer.parseInt(request.getAttribute("page").toString());
					for(int i=1;i<=p;i++){
						//out.println(i+" ");%>	
						<a href="ShowTypeServlet?num=<%=tp %>&pg=<%=i%>"><%out.println(i+" "); %></a>
				<% 	}
				%>
				页
				</div>
			</div>
			<div class="col-md-5 content-right">
			<div class="content-right-top">
				<h5 class="head">板块热点</h5>	
				
					<div class="editor text-center">
						<c:forEach items="${thnews }" var="hot">
							<a href="ShowOneServlet?id=${hot.news_id }">
							<h3>${hot.title }</h3>
							<p>${hot.summary }</p>
							</a>
							<label>点击量：${hot.hits }</label>
							<br/>
							<label>${hot.create_date }</label>
							<hr/>
						</c:forEach>
					</div>
				</div>
			</div>
			<div class="clearfix"></div>
			
			<div class="clearfix"></div>			
		</div>
	</div>
	<div class="footer">
		<div class="footer-top">
			<div class="container">
				<div class="col-md-3 footer-links">
					<h4>Other pages and things</h4>
					<a href="#">Design a creative Blog</a>
					<a href="#">Design a iPad Website</a>
					<a href="#">Single Page sales portfolio </a>
					<a href="#">Flat product website in Photoshop</a>
					<a href="#">Design a creative Blog</a>
					<a href="#">Design a iPad Website</a>
					<a href="#">Single Page sales portfolio </a>
					<a href="#">Flat product website</a>
				</div>
				<div class="col-md-3 footer-links span_66">
					<a href="#">Flat product website in Photoshop</a>
					<a href="#">Design a creative Blog</a>
					<a href="#">Design a iPad Website </a>
				</div>
				<div class="col-md-3 footer-links">
					<h4>Relevant Articles</h4>
					<a href="#">Design a creative Blog</a>
					<a href="#">Design a iPad Website</a>
					<a href="#">Single Page sales portfolio </a>
					<a href="#">Flat product website</a>
					<a href="#">Design a creative Blog</a>
				</div>
				<div class="col-md-3 footer-links">
					<h4>Other pages and things</h4>
					<a href="#">Blaz Robar</a>
					<a href="#">Nick Toranto</a>
					<a href="#">Joisp Kelava</a>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="footer-bottom">
			<div class="container">
				<div class="copyrights">
					<p>Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
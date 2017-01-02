<%@page import="org.apache.log4j.Logger"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE>
<html>
<head>
<title>首页</title>
<link href="static/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="static/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<!-- js -->

 <script type="text/javascript" src="static/js/jquery-1.11.1.min.js"></script>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Konstructs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="container">
		<div class="header-bottom">
            <div class="type">
				<h5>首页</h5>
			</div>
			<span class="menu"></span>
			<div class="list-nav">
				<ul>                                                                 
					<li><a href="ShowTypeServlet?num=1">军事</a></li>|
					<li><a href="ShowTypeServlet?num=2">汽车</a></li>|
					<li><a href="ShowTypeServlet?num=3">生活</a></li>|
					<li><a href="ShowTypeServlet?num=4">美女</a></li>|
					<li><a href="ShowTypeServlet?num=5">科技</a></li>|
					<li><a href="ShowTypeServlet?num=6">游戏</a></li>|
					<li><a href="ShowTypeServlet?num=7">其他</a></li>
				</ul>
			</div>
			<!-- script for menu -->
				<script>
				$( "span.menu" ).click(function() {
				  $( ".list-nav" ).slideToggle( "slow", function() {
				    // Animation complete.
				  });
				});
			</script>
			<!-- script for menu -->

			<div class="clearfix"></div>
        </div>
	</div>
    
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
	<div class="container">
		<div class="content">
			<!-- 最新新闻 -->
			<div class="col-md-7 content-left">
		
				<div class="article">
					<h5 class="head">最新</h5>
					<% 
						System.out.println("最新新闻！！");
					 %>
					<c:forEach items="${list }" var="ll">
					<input id="num" value="${ll.news_id }" type="hidden" />
					<h6>${ll.create_date }</h6>
					<a class="title" href="ShowOneServlet?id=${ll.news_id }">${ll.title }</a>
					<a href="single.jsp"><img src="static/images/a1.jpg" alt="" /></a>
					<p> ${ll.summary} </p>
					<p><a href="ShowOneServlet?id=${ll.news_id }">详情查看>></a></p>
				</c:forEach>
				</div>
			
			</div>
			
			<!-- 最新新闻结束 -->
			<!-- 右侧热点新闻 -->
			<div class="col-md-5 content-right">
			<div class="content-right-top">
				<h5 class="head">热点</h5>	
				<% 
						System.out.println("热点新闻！！");
					 %>
				<a href="single.jsp">
					<div class="editor text-center">
						<c:forEach items="${list_hot_news }" var="hot">
						<% 
							System.out.println("热点热点新闻！！");
					 	%>
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
				</a>
			
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
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>

<title>3D-Printing</title>
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
	<div class="container">
		<div class="header-bottom">
            <div class="type">
           
				<h5>搜索></h5>
	
			</div>
			<span class="menu"></span>
			<div class="list-nav">
				<ul>                                                                 
					<li><a href="ShowTypeServlet?num=1&pg=1">军事</a></li>|
					<li><a href="ShowTypeServlet?num=2&pg=1">汽车</a></li>|
					<li><a href="ShowTypeServlet?num=3&pg=1">生活</a></li>|
					<li><a href="ShowTypeServlet?num=4&pg=1">美女</a></li>|
					<li><a href="ShowTypeServlet?num=5&pg=1">科技</a></li>|
					<li><a href="ShowTypeServlet?num=6&pg=1">游戏</a></li>|
					<li><a href="ShowTypeServlet?num=7&pg=1">其他</a></li>
					<li>
					<form action="SearchServlet?pg=1" method="post">
					<input name="str" id="str" class="str" type="text" placeholder="关键字"/>
					<input type="submit" value="全站搜索"/>
					</form>
					</li>
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
	
	<div class="container">
		<div class="content">
			<div class="col-md-7 printing-content">
			当前查询：<%=request.getAttribute("num") %>条记录，共<%=request.getAttribute("p") %>页
			<br/>
			<hr/>
				<div class="print-main">
				
				<c:forEach items="${sch }" var ="sch">
					<h3>${ sch.title}</h3>
					<a href="ShowOneServlet?id=${sch.news_id }">${sch.summary }</a>
					<p class="sub_head">${sch.author } 时间：${sch.create_date }
					<br/>
					浏览人次：${sch.hits}
					</p>
					<p  class="sub_head"><a href="ShowOneServlet?id=${sch.news_id }">查看详情>></a></p>
					<!-- 内容 <p class="ptext">It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose injected humour and the like</p> -->
				<hr/>
				</c:forEach>
				第
				<%
				//tp:板块代码,p:总页码
				String str = request.getAttribute("s").toString(); 
				int p = Integer.parseInt(request.getAttribute("p").toString());
					for(int i=1;i<=p;i++){
						//out.println(i+" ");%>	
						<a href="SearchServlet?str=<%=str %>&pg=<%=i%>"><%out.println(i+" "); %></a>
				<% 	}
				%>
				页
				</div>
			</div>
			<div class="col-md-5 content-right">
			
				
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
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>
	<%=request.getAttribute("news_title") %>
</title>
<link href="static/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="static/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<script src="static/js/jquery-1.11.1.min.js"></script>
<!-- Custom Theme files -->
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Konstructs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
<body>
	<%@ include file="header.jsp" %>
	<%@ include file="nav.jsp" %>
	<div class="container">
		<div class="content">
			<div class="single-page">
				<div class="print-main">
				<!-- 网站内容部分 -->
				<c:forEach items="${news}" var = "n">
					<h3> ${ n.title} </h3>
					<a>${n.summary }</a>
					<p class="sub_head"> <a>${n.author } </a> 时间：${n.create_date }</p>
					<a><img src="static/images/printing.jpg" class="img-responsive" alt="" /></a>
					<p class="ptext"> ${n.content}</p>
					</c:forEach>
					
				</div>
				
			</div>
			<div class="col-md-7 single-content-left">
				<div class="single">
				<div class="leave">
				</div>
					<form action="addcomments" method="POST">
						<p class="comment-form-comment">
							<textarea name="content"></textarea>
						</p>
						<div class="clearfix"></div>
						<p class="form-submit">
							<input name="submit" type="submit"  value="评论">
						</p>
						<div class="clearfix"></div>
					</form>
				   	<div class="comments1">
								<h4>评论:</h4>
								<c:forEach items="${commentsList}" var="comments">
					  				<div class="comments-main">
											<div class="col-md-3 cmts-main-left">
												<img src="images/avatar.jpg" alt="">
											</div>
											<div class="col-md-9 cmts-main-right">
												<h5>TOM BROWN</h5>
												<p>${comments.content }</p>
												<div class="cmts">
													<div class="col-md-6 cmnts-left">
														<p>${comments.time }</p>
													</div>
													<div class="col-md-6 cmnts-right">
														<a href="#">回复</a>
													</div>
													<div class="clearfix"></div>
												</div>
											</div>
											<div class="clearfix"></div>
										</div>
								</c:forEach>
							
			  				</div>
							</div>
			</div>
			<div class="col-md-5 content-right content-right-top">
			<a><h5 class="head">相关</h5></a>
					<div class="editor text-center">
					<c:forEach items="${tnews}" var = "tn">
						<h3><a href="ShowOneServlet?id=${tn.news_id }">${tn.title }</a></h3>
						<!--摘要 <p>${tn.summary }</p> -->
						<label>${tn.create_date}</label>
						<span></span>
						<h1>---------------------------------</h1>
					
						</c:forEach>
					</div>
			</div>	
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
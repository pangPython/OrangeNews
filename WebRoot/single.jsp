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
	<div class="container">
		<div class="header-bottom">
            <div class="type">
				<h5><%=request.getAttribute("ts") %>></h5>
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
				<div class="features-list">
					<h3>Features</h3>
						<ul>
							<li><a href="#">Fused Filament Fabrication (FFF) using 1.75 mm filament</a></li>
							<li><a href="#">100 micron layer resolution capability</a></li>
							<li><a href="#">9″ diameter x 11″ tall build envelope (approximate)</a></li>
							<li><a href="#">Heated build platform (optional)</a></li>
							<li><a href="#">Efficient footprint to build envelope ratio</a></li>
							<li><a href="#">Printed object viewable from 360 degrees</a></li>
							<li><a href="#">Rigid aluminum extrusion construction</a></li>
							<li><a href="#">Utilizes open source software tool chain</a></li>
						</ul>
				</div>
				<div class="single">
				<div class="leave">
				<h4>Leave a comment</h4>
				</div>
				<form id="commentform">
				     <p class="comment-form-author-name"><label for="author">Name</label>
						<input id="author" name="author" type="text" value="" size="30" aria-required="true">
					 </p>
					 <p class="comment-form-email">
						<label for="email">Email</label>
						<input id="email" name="email" type="text" value="" size="30" aria-required="true">
					 </p>
					 <p class="comment-form-url">
						<label for="url">Website</label>
						<input id="url" name="url" type="text" value="http://w3layouts.com" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'http://w3layouts.com';}">
					 </p>
					 <p class="comment-form-comment">
						<label for="comment">Comment</label>
						<textarea></textarea>
					 </p>
					 <div class="clearfix"></div>
					<p class="form-submit">
			           <input name="submit" type="submit" id="submit" value="Send">
					</p>
					<div class="clearfix"></div>
				   </form>
				   	<div class="comments1">
								<h4>COMMENTS</h4>
			  				<div class="comments-main">
									<div class="col-md-3 cmts-main-left">
										<img src="images/avatar.jpg" alt="">
									</div>
									<div class="col-md-9 cmts-main-right">
										<h5>TOM BROWN</h5>
										<p>Vivamus congue turpis in laoreet sem nec ultrices. Fusce blandit nunc vehicula massa vehicula tincidunt. Nam venenatis cursus urna sed gravida. Ut tincidunt elit ut quam malesuada consequat. Sed semper purus sit amet lorem elementum faucibus.</p>
										<div class="cmts">
											<div class="col-md-6 cmnts-left">
												<p>On April 14, 2014, 18:01</p>
											</div>
											<div class="col-md-6 cmnts-right">
												<a href="#">Reply</a>
											</div>
											<div class="clearfix"></div>
										</div>
									</div>
									<div class="clearfix"></div>
								</div>
								<div class="comments-main">
									<div class="col-md-3 cmts-main-left">
										<img src="images/avatar.jpg" alt="">
									</div>
									<div class="col-md-9 cmts-main-right">
										<h5>MARK JOHNSON</h5>
										<p>Vivamus congue turpis in laoreet sem nec ultrices. Fusce blandit nunc vehicula massa vehicula tincidunt. Nam venenatis cursus urna sed gravida. Ut tincidunt elit ut quam malesuada consequat. Sed semper purus sit amet lorem elementum faucibus.</p>
										<div class="cmts">
											<div class="col-md-6 cmnts-left">
												<p>On April 14, 2014, 18:01</p>
											</div>
											<div class="col-md-6 cmnts-right">
												<a href="#">Reply</a>
											</div>
											<div class="clearfix"></div>
										</div>
									</div>
									<div class="clearfix"></div>
								</div>
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
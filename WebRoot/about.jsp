<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>About</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Konstructs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
<body>
	<!-- header-section-starts -->
	<div class="header">
		<div class="container">
			<div class="logo">
				<a href="index.jsp"><h1>ORANGE</h1></a>
			</div>
			<div class="pages">
				<ul>
					<li><a class="active" href="index.jsp">首页</a></li>
					<li><a href="3dprinting.jsp">3D Printers</a></li>
					<li><a href="404.jsp">Tutorials</a></li>
				</ul>
			</div>
			<div class="navigation">
				<ul>
					<li><a href="contact.jsp">Advertise</a></li>
					<li><a class="active" href="about.jsp">About Us</a></li>
					<li><a href="contact.jsp">Contact Us</a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<div class="container">
		<div class="header-bottom">
            <div class="type">
				<h5>Article Types</h5>
			</div>
			<span class="menu"></span>
			<div class="list-nav">
				<ul>                                                                 
					<li><a href="3dprinting.jsp">3D Printing</a></li>|
					<li><a href="materials.jsp">Materials</a></li>|
					<li><a href="printing.jsp">Printing</a></li>|
					<li><a href="filestoprint.jsp">Files to Print</a></li>|
					<li><a href="404.jsp">Videos</a></li>|
					<li><a class="active" href="about.jsp">About</a></li>
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
			<div class="about-content">
				<!-- about -->
			<h3>About Us</h3>			
			<img src="images/abt_pic.jpg" alt=" " />
			<p>Having hands on experience in creating innovative designs, I do offer design 
				solutions which harness the new possibilities of web based communication, 
				internet presence and current technology trends. 
				<label>I do specialize in all aspects of website designing, theme development, 
					designing custom home pages and landing pages At vero eos et accusamus 
					et iusto odio dignissimos ducimus
					qui blanditiis praesentium Nam libero tempore, cum soluta nobis est eligendi 
			optio cumque nihil impedit quo minus id quod maxime placeat facere 
			possimus, omnis voluptas assumenda est, omnis dolor repellendus. voluptatum...</label></p>
			<div class="clearfix"></div>
		<p class="Nam">Nam libero tempore, cum soluta nobis est eligendi 
			optio cumque nihil impedit quo minus id quod maxime placeat facere 
			possimus, omnis voluptas assumenda est, omnis dolor repellendus.
			Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus 
			saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae.</p>
		<div class="more">
			<a href="single.jsp">Learn More</a>
		</div>
	</div>
<!-- //about -->
		<div class="col-md-7 content-left">
				<div class="article">
					<h5 class="head">in recent news</h5>
					<h6>Software </h6>
					<a class="title" href="single.jsp">DeltaMaker – The new kid on the block An Elegant 3D Printer and a new wicked ass thing</a>
					<a href="single.jsp"><img src="images/a1.jpg" alt="" /></a>
					<p>Products were inspired by Behance's research of especially productive teams in the creative industry. Hundreds of individuals and teams were interviewed, and Behance chronicled the work habits and best practices of creative leaders. </p>
					<p>The paper products were initially designed by and for the Behance team as a way to stay organized. In 2007, at the insistence of friends who wanted Action Pads of their own...</p>
				</div>
			</div>
			<div class="col-md-5 content-right content-right-top">
				<h5 class="head">Popular</h5>	
				<a href="single.jsp">
				<div class="editor text-center">
					<h3>DeltaMaker – The new kid on the block An Elegant 3D Printer</h3>
					<p>A new cheap ass 3D Printer worth checking out</p>
					<label>2 Days Ago</label>
					<span></span>
				</div>
				</a>
				<a href="single.jsp">
				<div class="editor text-center">
					<h3>DeltaMaker – The new kid on the block An Elegant 3D Printer</h3>
					<p>A new cheap ass 3D Printer worth checking out</p>
					<label>2 Days Ago</label>
					<span></span>
				</div>
				</a>
				<a href="single.jsp">
				<div class="editor text-center">
					<h3>Software Review: Autodesk Inventor Fusion for Mac</h3>
					<p>3D Printing, 3D Software</p>
					<label>3 Days Ago</label>
					<span></span>
				</div>
				</a>
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

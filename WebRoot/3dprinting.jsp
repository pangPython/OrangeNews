<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
	  <%@ include file="header.jsp" %>
	<div class="container">
		<div class="header-bottom">
            <div class="type">
				<h5>Printing</h5>
			</div>
			<span class="menu"></span>
			<div class="list-nav">
				<ul>                                                                 
					<li><a class="active" href="#">3D Printing</a></li>|
					<li><a href="materials.jsp">Materials</a></li>|
					<li><a href="printing.jsp">Printing</a></li>|
					<li><a href="filestoprint.jsp">Files to Print</a></li>|
					<li><a href="404.jsp">Videos</a></li>|
					<li><a href="about.jsp">About</a></li>
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
				<div class="print-main">
					<h3>3D Printing</h3>
					<a href="single.jsp">Software Review: Autodesk Inventor Fusion for Mac</a>
					<p class="sub_head">Posted by <a href="#">Admin</a> on february 14,2015</p>
					<a href="single.jsp"><img src="images/print.jpg" class="img-responsive" alt="" /></a>
					<p class="ptext">It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose injected humour and the like</p>
				</div>
				<div class="print-grids">
					<div class="print-grid">
						<div class="print-img">
							<a href="single.jsp"><img src="images/p1.jpg" class="img-responsive" alt="" /></a>
						</div>
						<div class="print-text">
							<a class="bhead" href="single.jsp">Nokia offering customers printable STL phone cases for the Lumia 820</a>
							<p><a href="#">3D Printing, <a href="#">3D Software,</a><a href="#"> Files to Print </a> |   may 19, 2014</p>
							<p>This week Nokia announced it is giving away files for printable case for it’s new Lumia 820 range. This is</p>
							<a class="more" href="single.jsp">...Read More</a>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="print-grid">
						<div class="print-img">
							<a href="single.jsp"><img src="images/p2.jpg" class="img-responsive" alt="" /></a>
						</div>
						<div class="print-text">
							<a class="bhead" href="single.jsp">MarkerBot Announces the ‘Replicator 2x’ – For the Experimental Types</a>
							<p><a href="#">3D Printing, <a href="#">3D Software,</a><a href="#"> Files to Print </a> |   may 19, 2014</p>
							<p>This week Nokia announced it is giving away files for printable case for it’s new Lumia 820 range. This is</p>
							<a class="more" href="single.jsp">...Read More</a>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="print-grid">
						<div class="print-img">
							<a href="single.jsp"><img src="images/p3.jpg" class="img-responsive" alt="" /></a>
						</div>
						<div class="print-text">
							<a class="bhead" href="single.jsp">2012 London 3D printer show – A Round up</a>
							<p><a href="#">3D Printing, <a href="#">3D Software,</a><a href="#"> Files to Print </a> |   may 19, 2014</p>
							<p>This week Nokia announced it is giving away files for printable case for it’s new Lumia 820 range. This is</p>
							<a class="more" href="single.jsp">...Read More</a>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="print-grid">
						<div class="print-img">
							<a href="single.jsp"><img src="images/p4.jpg" class="img-responsive" alt="" /></a>
						</div>
						<div class="print-text">
							<a class="bhead" href="single.jsp">3D Printed Belts by Francis Bitonti Studio – Very cool</a>
							<p><a href="#">3D Printing, <a href="#">3D Software,</a><a href="#"> Files to Print </a> |   may 19, 2014</p>
							<p>This week Nokia announced it is giving away files for printable case for it’s new Lumia 820 range. This is</p>
							<a class="more" href="single.jsp">...Read More</a>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<div class="col-md-5 content-right">
			<div class="content-right-top">
				<h5 class="head">Popular</h5>	
				<a href="single.jsp">
					<div class="editor text-center">
						<h3>DeltaMaker – The new kid on the block An Elegant 3D Printer</h3>
						<p>A new cheap ass 3D Printer worth checking out</p>
						<label>2 Days Ago</label>
						<span></span>
					</div>
				</a>
				<a class="active" href="single.jsp">
					<div class="editor text-center">
						<h3>Software Review: Autodesk Inventor Fusion for Mac</h3>
						<p>3D Printing, 3D Software</p>
						<label>3 Days Ago</label>
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
				<div class="editors-pic-grids">
					<h5>Editors Pick</h5>
					<div class="editors-pic">
						<div class="e-pic">
							<a href="single.jsp"><img src="images/ep1.jpg" alt="" /></a>
						</div>
						<div class="e-pic-info">
							<a href="single.jsp">MarkerBot Announces the ‘Replicator 2x’  For the Experimental</a>
							<span></span>
							<label>2 Days Ago</label>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="editors-pic">
						<div class="e-pic">
							<a href="single.jsp"><img src="images/ep2.jpg" alt="" /></a>
						</div>
						<div class="e-pic-info">
							<a href="single.jsp">3D Printed Record – the next revolution?</a>
							<span></span>
							<label>2 Days Ago</label>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="editors-pic">
						<div class="e-pic">
							<a href="single.jsp"><img src="images/ep3.jpg" alt="" /></a>
						</div>
						<div class="e-pic-info">
							<a href="single.jsp">MarkerBot Announces the ‘Replicator 2x’  For the Experimental</a>
							<span></span>
							<label>2 Days Ago</label>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="editors-pic">
						<div class="e-pic">
							<a href="single.jsp"><img src="images/ep4.jpg" alt="" /></a>
						</div>
						<div class="e-pic-info">
							<a href="single.jsp">3D Printed Record – the next revolution?</a>
							<span></span>
							<label>2 Days Ago</label>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="features">
				<h5>Featured news</h5>
				<h2>Nokia offering customers printable STL phone cases for the Lumia 820</h2>
			</div>
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
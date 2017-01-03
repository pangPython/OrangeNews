<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="container">
		<div class="header-bottom">
            <div class="type">
				<h5>
				<%
				try{
					String  tyn = request.getAttribute("tyn").toString();
					%>
					<a href="ShowTypeServlet?num=<%=request.getAttribute("tyn").toString() %>&pg=1"><%=request.getAttribute("ts") %>></a>
				<%
				}catch(Exception e){
				%>
				首页
				<%
				}
				
				 %>
				</h5>
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
									<input type="text"  name="str"> 
									<button class="btn btn-default" type="submit">全站搜索</button> 
								
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
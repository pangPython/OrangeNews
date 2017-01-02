<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%=request.getAttribute("info") %>
<%response.setHeader("Refresh","5;url=login.jsp");%>
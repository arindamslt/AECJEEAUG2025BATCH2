<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW DATA</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<%
String cid=request.getParameter("cid");
String cname=request.getParameter("cname");
String cphno=request.getParameter("cphno");
%>
<h2 class="text-dark">CID:<%=cid %></h2>
<h2 class="text-info">NAME:<%=cname %></h2>
<h2 class="text-secondary">PHONE NO:<%=cphno %></h2>
</body>
</html>
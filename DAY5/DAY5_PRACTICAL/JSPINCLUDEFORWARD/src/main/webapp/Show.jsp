<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Img1.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show page</title>
</head>
<body>
<%
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");

%>
<h2>WELCOME:<%=uname %></h2>
<p>
<h2>PASSWORD IS:<%=pass %></h2>
</body>
</html>
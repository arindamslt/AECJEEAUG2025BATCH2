<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String pid=request.getParameter("pid");
String pname=request.getParameter("pname");
String company=request.getParameter("company");
int pqty=Integer.parseInt(request.getParameter("pqty"));
double price=Double.parseDouble(request.getParameter("price"));
%>
<h2>PRODUCT ID:<%=pid %></h2>
<h2>PRODUCT NAME:<%=pname %></h2>
<h2>QUANTITY:<%=pqty %></h2>
<h2>PRICE:<%=price %></h2>
<h2>COMPANY NAME:<%=company %></h2>
</body>
</html>
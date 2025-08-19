<%@page import="master.dao.OrderDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="master.dao.FoodDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:include page="Nav.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FOOD REPORT</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
<h2 class="text-primary" style="text-align:center;">LIST OF FOOD AVAILABLE</h2>
<table class="table table-hover table-striped table-bordered">
<thead class="table-dark">
<tr>
<th>ORDER ID</th>
<th>ORDER DATE</th>
<th>FOOD ID</th>
<th>QUANTITY</th>
<th>CUSTOMER ID</th>
</tr>
</thead>
<%
OrderDao fdao=new OrderDao();
ResultSet  rs=fdao.getData();
while(rs.next())
{
%>
<tbody>
<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getDate(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getInt(4) %></td>
<td><%=rs.getString(5) %></td>
</tbody>
<%
}
%>
</table>
</div>
</body>
</html>
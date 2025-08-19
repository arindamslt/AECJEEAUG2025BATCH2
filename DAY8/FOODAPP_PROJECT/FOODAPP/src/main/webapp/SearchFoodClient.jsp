<%@page import="java.sql.ResultSet"%>
<%@page import="master.dao.FoodDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="NavClient.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SEARCH FOOD</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
<form action="SearchFoodClient.jsp" method="post">
<h2 class="text-primary">SEARCH FOOD FORM</h2>
<input type="text" class="form-control" name="fid" placeholder="ENTER THE FOOD ID"/>
<input type="submit" class="btn btn-outline-primary" value="SEARCH"/>
</form>
</div>

<%
String fid=request.getParameter("fid");
FoodDao fdao=new FoodDao();
ResultSet  rs=fdao.searchFid(fid);
if(rs.next()) 
{
%>
<div style="width:30%;margin:50px auto;">
<h2 class="text-primary" style="text-align:center;">LIST OF FOOD AVAILABLE</h2>
<table class="table table-hover table-striped table-bordered">
<thead class="table-dark">
<tr>
<th>FOOD ID</th>
<th>FOOD NAME</th>
<th>PRICE</th>
</tr>
</thead>
<tbody>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getDouble(3) %>
</tbody>
</table>
<%
} 
%>
</div>
</body>
</html>
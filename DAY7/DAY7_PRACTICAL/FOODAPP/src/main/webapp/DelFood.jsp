<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Nav.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DELETING FOOD</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
<form action="FoodDelServe" method="post">
<h2 class="text-primary">DELETE FOOD FORM</h2>
<input type="text" class="form-control" name="fid" placeholder="ENTER THE FOOD ID"/>
<input type="submit" class="btn btn-outline-primary" value="DELETE"/>
</form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="NavClient.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADDING FOOD</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
<form action="OrderServe" method="post">
<h2 class="text-primary">ADD ORDER</h2>
<input type="text" class="form-control" name="fid" placeholder="ENTER THE FOOD ID"/>
<input type="text" class="form-control" name="qty" placeholder="ENTER THE QUANTITY"/>
<input type="text" class="form-control" name="uname" placeholder="ENTER THE USERNAME"/>
<input type="submit" class="btn btn-outline-primary" value="ORDER"/>
</form>
</div>
</body>
</html>
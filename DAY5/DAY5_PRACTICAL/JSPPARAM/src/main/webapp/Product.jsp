<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PRODUCT PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
<form action="ProductController.jsp" method="post">
<h2 class="text-success">PURCHASE FORM</h2>
<input type="text" class="form-control" name="pid" placeholder="ENTER THE PRODUCT ID"/>
<input type="text" class="form-control" name="pname" placeholder="ENTER THE PRODUCT NAME"/>
<input type="text" class="form-control" name="pqty" placeholder="ENTER THE PRODUCT QUANTITY"/>
<input type="text" class="form-control" name="price" placeholder="ENTER THE PRODUCT PRICE"/>
<input type="submit" class="btn btn-outline-danger" value="PURCHASE"/>
</form>
</div>
</body>
</html>
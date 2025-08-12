<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP DEMO</title>
</head>
<body>
<%!
 public int multiply(int a,int b)
{
	
 return(a*b);	
}
	%>

<%
int x=25;
int y=60;
%>
RESULT:<%=x+y %>
<p>
OUTPUT:<% out.println(x+y);%>

	<p>
	RES:<%=multiply(25,4) %>

</body>
</html>
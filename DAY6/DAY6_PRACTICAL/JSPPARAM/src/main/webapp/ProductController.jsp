<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
public String getCompnay(double price)
{
	String compnm=null;
	if(price>25000.00)
	{
		compnm="SONY";
	}
	else
	{
		compnm="SAMSUNG";
	}
	return compnm;
}
%>
<%
double price=Double.parseDouble(request.getParameter("price"));
%>
<jsp:forward page="Show.jsp">
<jsp:param value="<%=this.getCompnay(price) %>" name="company"/>
</jsp:forward>


</body>
</html>
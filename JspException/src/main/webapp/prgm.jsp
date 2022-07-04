<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page errorPage="Error.jsp" %>  

<%
int in1=Integer.parseInt(request.getParameter("name1"));
int in2=Integer.parseInt(request.getParameter("name2"));
int divide=in1/in2;
out.print("division of two numbers"+divide);
%>
</body>
</html>
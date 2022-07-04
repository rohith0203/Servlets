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
out.print("Welcome:"+request.getParameter("name1"));
String s=application.getInitParameter("dname");
out.print("welcome:"+s);


%>
</body>
</html>
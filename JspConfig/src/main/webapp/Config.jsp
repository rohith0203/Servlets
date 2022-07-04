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
out.print("welcome:"+request.getParameter("name1"));

String d=config.getInitParameter("dname");
out.print("name is::"+d);



%>
</body>
</html>
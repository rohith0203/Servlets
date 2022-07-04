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
   String s=request.getParameter("name1");
out.print("welcome:"+s);
session.setAttribute("username",s);


//request.getRequestDispatcher("Session2.jsp").forward(request,response);
%>

<a href="Session2.jsp">second page</a>
</body>
</html>
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
String user=request.getParameter("name1");
out.print("Welcome:"+user);

pageContext.setAttribute("username",user,PageContext.SESSION_SCOPE);



%>
<a href="PageContext2.jsp">Second page</a>

</body>
</html>
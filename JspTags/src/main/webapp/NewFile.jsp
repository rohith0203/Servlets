<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%!
String name="rohith";
public  String reverse()
{
	StringBuffer sb=new StringBuffer(name);
	return sb.reverse().toString();
}

%>
<% 
int x=Integer.parseInt(request.getParameter("name1"));
int y=Integer.parseInt(request.getParameter("name2"));
int k=x+y;
out.print("result is::"+k);

%>
<%=reverse()



%>





</body>
</html>
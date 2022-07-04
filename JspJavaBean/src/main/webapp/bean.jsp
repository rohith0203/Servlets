<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="c1" class="com.beans.Emp"  ></jsp:useBean>
<jsp:setProperty property="id" name="c1"  value="112"/>
<jsp:setProperty property="name" name="c1"  value="rohith"/>
<jsp:setProperty property="clg" name="c1"  value="bhavans"/>

<jsp:getProperty property="id" name="c1"/>
<jsp:getProperty property="name" name="c1"/>
<jsp:getProperty property="clg" name="c1"/>
</body>
</html>
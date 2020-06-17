<%@page import="com.capgemini.model.Avatar"%>
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

Avatar a1 = (Avatar)session.getAttribute("Avatar");
out.println(a1);

%>



</body>
</html>
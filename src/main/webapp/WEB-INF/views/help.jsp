<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.time.LocalDateTime" %>
<%@page isELIgnored="false" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>

<% 
 /* 	String name = (String) request.getAttribute("name");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
 %>
 
 	<h1>Hello my name is <%-- <%=name %> --%> ${name }</h1>
	<h1>This is Help page</h1>
	<h1>Date and Time is <%-- <%= time.toString() %> --%> ${time }</h1>
	<hr>
	
	<c:forEach var="item" items="${marks }">	
		<h1>${item }</h1>
	</c:forEach>
</body>
</html>
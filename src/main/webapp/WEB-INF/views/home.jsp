<%@ page import = "java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>My Home Page</h1>
	<h1>Called by Ganesh</h1>
	
	<%
	  String name = (String)request.getAttribute("name");
	  Integer id =  (Integer)request.getAttribute("id");	 
 	   List<String> friends=(List<String>) request.getAttribute("f");  
	%>
	
	<h1> Name is <%=name %></h1>
	<h1>Id id <%=id %></h1>
	
	<%
		for(String s:friends){
		%>
		<h1><%=s %></h1>
		<% 
			
		}
	%>
</body>
</html>
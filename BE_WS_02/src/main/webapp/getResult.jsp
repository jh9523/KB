<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String job = (String)request.getAttribute("job");
	HashMap map = (HashMap)request.getAttribute("map");
%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get</title>
</head>
<body>
	
	<h1>map = <%= job %>
			<%= map.get(job) %></h1>
</body>
</html>
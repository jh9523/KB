<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String result = (String)request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find_number_mvc.jsp</title>
</head>
<body>
	<h1> <%= result %> </h1>
	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String msg = (String)request.getAttribute("msg");
%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 작업 결과</title>
</head>
<body>

	<h1>멤버 작업 결과</h1>
	<p>메시지 : ${msg}</p>
	<p>아 디 : ${param.id}</p>
	<p>이 름 : ${param.name}</p>
	<p>비 번 : ${param.pwd}</p>
	<p>상 태 : ${param.status}</p>
	<hr>
	<a href="list">멤버 목록</a>	

</body>
</html>
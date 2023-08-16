<%@page import="web0816.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberDto dto = (MemberDto)request.getAttribute("dto");	// 다운캐스팅
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberRegist2.jsp</title>
</head>
<body>
	
	dto = <%= dto %>	<hr>
	dto.name = <%= dto.getName() %> <br>
	dto.age = <%= dto.getAge() %> <br>
	
</body>
</html>
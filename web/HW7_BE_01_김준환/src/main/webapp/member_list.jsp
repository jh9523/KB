<%@page import="member.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<MemberDto> list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 목록</title>
<style type="text/css">
	a{ text-decoration: none; color: black;}
	a:hover{ text-decoration: underline; color:blue; }
	
</style>
</head>
<body>

	<h1>멤버 목록</h1>
	<table>
		<tr>
			<td>아 디</td>
			<td>이 름</td>
			<td>비 번</td>
			<td>상 태</td>
		</tr>
		<% for(MemberDto dto : list){ %>
		<tr>
			<td><a href="detail?id=<%= dto.getId() %>"><%= dto.getId() %></td>
			<td><%= dto.getName() %></td>
			<td><%= dto.getPwd()%></td>
			<td><%= dto.getStatus()%></td>
		</tr>
		<% } %>
		
	</table>
</body>
</html>
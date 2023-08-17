<%@page import="member.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberDto dto = (MemberDto)request.getAttribute("dto");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<h1>멤버 디테일</h1>
		<table>
			<tr>
				<th>아 디</th><td>${dto.id }</td>
			</tr>
			<tr>
				<th>이 름</th><td>${dto.name }</td>
			</tr>
			<tr>
				<th>비 번</th><td>${dto.pwd}</td>
			</tr>
			<tr>
				<th>상 태</th><td>${dto.status}</td>
			</tr>
		</table>
		<a href="list">목록</a>
		<a href="update_form?id=${dto.id}">수정</a>
		<!-- 수정폼은 검색한 dto 각 변수를 등록폼에 출력 -->
		<!-- 수정폼은 상세보기 + 등록폼 -->
		<a href="delete_form?id=${dto.id}">삭제</a>
</body>
</html>
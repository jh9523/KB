<%@page import="board.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDto dto = (BoardDto)request.getAttribute("dto");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
		<h1>게시물 디테일</h1>
		<table>
			<tr>
				<th>번호</th><td>${dto.no }</td>
			</tr>
			<tr>
				<th>제목</th><td>${dto.title }</td>
			</tr>
			<tr>
				<th>작성자</th><td>${dto.writer}</td>
			</tr>
			<tr>
				<th>작성일</th><td>${dto.regdate}</td>
			</tr>
		</table>
		<a href="board?command=list">목록</a>
		<a href="board?command=update_form?no=${dto.no}">수정</a>
		<!-- 수정폼은 검색한 dto 각 변수를 등록폼에 출력 -->
		<!-- 수정폼은 상세보기 + 등록폼 -->
		<a href="board?command=delete_form?no=${dto.no}">삭제</a>
		
		
		
</body>
</html>
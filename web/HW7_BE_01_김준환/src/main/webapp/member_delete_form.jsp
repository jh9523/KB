<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제</title>
</head>
<body>
	<h1>삭제할 게시물</h1>
	<table>
		<tr>
			<th>아 디</th><td>${dto.id }</td>
		</tr>
		<tr>
			<th>이 름</th><td>${dto.name}</td>
		</tr>
		<tr>
			<th>비 번</th><td>${dto.pwd}</td>
		</tr>
		<tr>
			<th>상 태</th><td>${dto.status}</td>
		</tr>
	</table>
	<a href="list">목록</a>
	<a href="delete_action?id=${dto.id}">삭제</a>
	
	

</body>
</html>
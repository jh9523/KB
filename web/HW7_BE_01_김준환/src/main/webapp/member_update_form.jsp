<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 수정 폼</title>
</head>
<body>
	<h1>멤버 수정</h1>
	<form action="update_action">
		<input type="hidden" name="id" value="${dto.id}">
		이 름 : <input name="name" value="${dto.name}"><br>
		비 번 : <input name="pwd" value="${dto.pwd}"><br>
		
		상 태 : <select name="status">
					<option value="Y">Y</option>
					<option value="N">N</option>
				</select>
		
		
		<br>
		<br>
		<input type="submit" value="멤버 수정">
	</form>
</body>
</html>
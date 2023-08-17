<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 등록폼</title>
</head>
<body>

	<h1>멤버 등록</h1>
	<form action="insert_action">
		아 디 : <input name="id"><br>
		이 름 : <input name="name"><br>
		비 번 : <input name="pwd"><br>
		상 태 : <select name="status">
				<option value="Y">Y</option>
				<option value="N">N</option>
			</select>
		<br>
		<input type="submit" value="멤버 등록">
	</form>
	
	
	
</body>
</html>
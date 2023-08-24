<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
	<form action="gugudan_view">
		<fieldset>
		2~9단 선택 : <select name ='dan'>
			<option value=2>2</option>
			<option value=3>3</option>
			<option value=4>4</option>
			<option value=5>5</option>
			<option value=6>6</option>
			<option value=7>7</option>
			<option value=8>8</option>
			<option value=9>9</option>
		</select>
		<br>
		<input type="submit" value="구구단 보기">
		</fieldset>
		
	</form>
	empty param.dan = ${ empty param.dan } <br>
	not empty param.dan = ${ not empty param.dan } <br>
	<c:if test="${ not empty param.dan}">
	
		<c:forEach begin="1" end="9" var="i">
		${param.dan} * ${i} = ${ param.dan * i }<br>
		</c:forEach>
	</c:if>
	<div id="result">${result}</div>
</body>
</html>
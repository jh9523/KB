<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HangMan</title>
	<style>
		.main {
			display: flex;
			align-items: center;
			flex-direction: column;
		}

		#alpha span {
			margin: 0 5px;
			font-size: 25px;
			color: blue;
		}

		#chance {
			font-size: 20px;
			margin: 15px;
		}
		
		#underlines {
			margin: 15px 0;
		}

		#underlines span {
			margin: 0 3px;
			font-size: 35px;
		}
		
	</style>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
	
</head>
<body>
	<h1>Hangman Game - Category: Animals</h1>
	<div id="underlines"></div>
	<div id="alpha"></div>
	<div id="img"></div>
	<div id="chance"></div>
	
	
</body>
</html>
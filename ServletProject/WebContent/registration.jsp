<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Registration</title>
	</head>
	<body>
		<form action="/ServletProject/register" method="post">
			<input name="login" placeholder="Login">
			<input name="password" type="password" placeholder="Password">
			<input type="submit" value="Ok">
		</form>
	</body>
</html>
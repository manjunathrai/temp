<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
	font-size: 50px;
	text-align: center;
}
h2 {
	font-size: 25px;
	text-align: center;
}
form {
	padding: 10px;
	width: 30%; 
	text-align: left;
	margin: auto;
	font-size: 20px
}
input {
	float: right;
}
</style>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
</head>
<body bgcolor="siver">
	<h1>MyMail</h1>
	<hr>
	<h2>Forgot Password</h2>
	<hr>
	<form action="./forgotpasswords" method="post">
	New Password : <input type="password" name="password"><br><br>
	Re-Enter New Password : <input type="text" name="re_password"><br><br>
	<input type="submit" value="Change Password">
	</form>
</body>
</html>
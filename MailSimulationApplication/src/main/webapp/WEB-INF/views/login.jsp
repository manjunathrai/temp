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
a{

text-decoration: none;
color: black;
font-size: 20px
}
h6{
padding;2px;
text-align:center;
font-size: 10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="silver">
	<h1>MyMail</h1>
	<hr>
	<h2>Login Here</h2>
	<hr>
	<div>
	<form action="./login" method="post">
	Email Id <input type="email" name="email" required="required"><br><br>
	Password <input type="password" name="password" required="required"><br><br>
	<input type="submit" value="Login"><br>
	<h6><a href="./forgotpassword">Forgot Password ?	</a></h6>
	<p>--------------------------or-------------------------</p>
	<h6><a href="./register">Create New Account</a></h6>
	
	</form>
	
	
	</div>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
<h1>InValid your name or Password</h1>
<hr>
<form action="./relogin" method="post">

User_name : <input type="text" placeholder="User name" name="name">
<br>
<br>
Password : <input type="password" placeholder="Password" name="password">
<br>
<br>
<input type="submit" value="Login">
</form>

</body>
</html>
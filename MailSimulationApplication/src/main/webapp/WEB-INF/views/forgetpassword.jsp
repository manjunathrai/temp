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
<body bgcolor="silver">
	<h1>MyMail</h1>
	<hr>
	<h2>Forgot Password</h2>
	<hr>
	<div>
	<form action="./forgetpassword" method="post">
	Email : <input type="email" name="email"><br><br>
      Security Question : <input list="city" name="question">
        <datalist id="city">
           <option value="Enter you pet Name">Enter you pet Name</option>
            <option value="Enter you school Name">Enter you school Name</option>
            <option value="Enter you Mother Name">Enter you Mother Name</option>
            <option value="Enter your childhood Friend Name">Enter your childhood Friend Name</option>
        </datalist><br><br>
        Answer : <input type="text" name="answer" placeholder="Enter you answer"><br><br>
        <input type="submit" value="submit">
        </form>
        </div>
</body>
</html>
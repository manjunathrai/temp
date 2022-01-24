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
	text-align: left;
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

a {
	text-decoration: none;
	color: black;
	font-size: 20px
}

h6 {padding; 2px;
	text-align: center;
	font-size: 10px;
}

a {
	text-align: center;
	text-decoration: none;
	color: black;
	font-size: 20px
}
</style>
<meta charset="ISO-8859-1">
<title>Log out</title>
</head>
<body bgcolor="silver">
	<h1>MyMail</h1>
	<hr>
	<h2><%=request.getAttribute("username")%>
		, Your logged out <a style="float: right;" href="./welcome">Home</a>
	</h2>
	<hr>
	<div>
		<form action="./login" method="post">
			Email Id <input type="email" name="email" required="required"><br>
			<br> Password <input type="password" name="password"
				required="required"><br> <br> <input type="submit"
				value="Login"><br>
			<h6>
				<a href="./forgotpassword">Forgot Password ? </a>
			</h6>
			<p style="text-align: center;">--------------------------or-------------------------</p>

			<h6>
				<a href="./register">Create New Account</a>
			</h6>
		</form>
	</div>

</body>
</html>
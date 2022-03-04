<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.topnav {
	background-color: #333;
	overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
	float: right;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 20px;
}

/* Change the color of links on hover */
.topnav a:hover {
	background-color: #ddd;
	color: black;
}

#h2 {
	color: #f2f2f2;
	text-align: center;
}

main {
	display: flex;
	height: 530px;
	width: 100%;
	background:
		url(https://www.athletadesk.com/wp-content/uploads/2016/08/join-background.jpg)
		no-repeat center center;
	background-size: cover;
}

form {
	padding: 10px;
	width: 40%;
	margin: auto;
	height: 550px;
	background-size: cover;
}

input {
	float: right;
}

label {
	font-size: 20px;
	color: black;
	text-transform: uppercase;
}
#h1{
color: #f2f2f2;
}

#id {
	float: left;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="topnav">
		<h1 id="h1">  Welcome <%=request.getAttribute("name") %>,
		
			 <a href="./get">Get Employee Details</a>
			  <a href="./add">Add Employee Details</a> <a
				href="./update">Update Employee Details</a> 
				<a href="./home">Home</a>
				<a href="./logout">Logout</a>
		</h1>
	</div>
	<main>
	<form action="./delete" method="post">
	<h1 id="h2">Delete Employee Details</h1>
	<br>
		<label for="fname">Employee NAME</label> <input type="text" id="fname"
			name="empname" required="required"> <br>
		<br> <input id="id" type="submit" value="Delete Records">
	</form>
	</main>
</body>
</html>
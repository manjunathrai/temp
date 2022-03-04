<%@page import="com.te.testcaseApp.dto.Clientdetails"%>
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
		  <a href="./available">Check Room Availability</a>
		 <a href="./update">Update Client Details</a> 
		 <a href="./payment">Payment</a>
		 <a href="./checkout">Check Out</a>
		 <a href="./home">Home</a>
		 <a href="./book">Book Room </a>
		 <a href="./logout">Logout</a>
		 </h1>
	</div>
	<main>
		<form >
	<h1 id="h2">Client Details</h1>
	<% Clientdetails detail =  ( Clientdetails )request.getAttribute("detail"); %>
	<h1>Name : <%=detail.getClientname() %></h1>
	<h1>Email : <%=detail.getClientemail() %></h1>
	<h1>Phone number : <%=detail.getPhonenumber() %></h1>
	<h1 style="text-decoration: underline;"> Room Details:</h1>
	<h2> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Room Number : <%= detail.getRoom().getRoomnum() %></h2>
	<h2>&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Floor : <%= detail.getRoom().getFloor() %></h2>
	<h2>&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Status : <%= detail.getRoom().getStatus() %></h2>
	
	</form>
	 </main>
</body>
</html>
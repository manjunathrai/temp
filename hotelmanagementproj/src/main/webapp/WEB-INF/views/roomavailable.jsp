<%@page import="com.te.testcaseApp.dto.RoomDetailsDisplay"%>
<%@page import="java.util.List"%>
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
</head>
<body>
<div class="topnav">
	<h1 id="h1">  Welcome <%=request.getAttribute("name") %>,
		 <a href="./get">Get Client Details</a>
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
	<h1 id="h2">Room Details</h1>
	<% List<RoomDetailsDisplay> lst = (List<RoomDetailsDisplay>) request.getAttribute("detail"); %>
	<%for(int i = 0;i<lst.size();i++){ %>
		<h2>Room Number = <%=lst.get(i).getRoomnum() %> | Floor = <%=lst.get(i).getFloor() %> </h2>
		<%} %>
	</form>
	 </main>
</body>
</html>
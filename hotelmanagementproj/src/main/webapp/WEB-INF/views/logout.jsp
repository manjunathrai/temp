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
	font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
	background-color: #ddd;
	color: black;
}
#h1{
color: #f2f2f2;
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
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="topnav">
	<h1 id="h1">  Thank you <%=request.getAttribute("name") %>,
		 <a href="./login">login again</a>
		 </h1>
	</div>
	<main>
		 <h1><%= request.getAttribute("message") %></h1>
		 </main>

</body>
</html>
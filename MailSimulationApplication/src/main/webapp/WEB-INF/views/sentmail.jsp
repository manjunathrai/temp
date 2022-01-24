<%@page import="javax.net.ssl.SSLEngineResult.Status"%>
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
a{
float: right;
text-decoration: none;
color: black;
font-size: 20px
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="silver">
	<h1>New Mail</h1>
	<hr>
	<h2><a href="./home">Home</a></h2>
	<% String status = (String)request.getAttribute("status"); %>
	<%if(status.equals("Invalidmail")) {%>
	<h2> <%= request.getAttribute("status") %>  Id</h2>
	<%} else {%>
	<h2>Mail saved in <%= request.getAttribute("status") %></h2>
	<%} %>
</body>
</html>
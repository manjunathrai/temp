<%@page import="com.te.mailsimulation.bean.SentMailBean"%>
<%@page import="java.util.List"%>
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
	float: right;
	text-decoration: none;
	color: black;
	font-size: 20px
}
</style>
<meta charset="ISO-8859-1">
<title>Draft</title>
</head>
<body bgcolor="silver">
	<h1>Draft</h1>
	<hr>
	<div>
		<h2 id="hed1">
			Welcome
			<%=request.getAttribute("username")%>, <a href="./logout">Logout&emsp;&emsp;&emsp;</a>
			<a href="./home">Home&emsp;&ensp;</a> <a href="./sent">Sent&emsp;&ensp;</a>
			<a href="./newmail">New Mail&emsp;&ensp;</a>
		</h2>
	</div>
	<hr>
	<% List<SentMailBean> res= (List<SentMailBean>) request.getAttribute("draft"); %>
	<%for(int i=0;i<res.size();i++){%>
	<h4>From :&emsp;<%= res.get(i).getFromemail() %></h4>
	<h4>Subject :&emsp;<%= res.get(i).getSubject() %></h4>
	<h4>Message:&emsp;<%= res.get(i).getMessage() %></h4>
	<hr>
	<%} %>

</body>
</html>
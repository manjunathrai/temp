<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
div{
	text-align: center;
	
}
h1{
text-align: center;
}
#i1{
float: inherit;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h1>Deleting record</h1>
<hr>
<h1></h1>
<div>
<form action="./delete" method="post">
Employeed id : <input type="text" name="id"><br><br>
<input id="i1" type="submit" value="submit">
</form>
</div>
</body>
</html>
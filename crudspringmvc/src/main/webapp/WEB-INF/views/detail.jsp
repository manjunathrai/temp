<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1{
text-align: center;
}
div{
text-align: center;
}
#i1{
float: inherit;
}
</style>
<meta charset="ISO-8859-1">
<title>Search Page</title>
</head>
<body bgcolor="grey">
<h1>Search record</h1>
<hr>
<h1></h1>
<div>
<form action="./detail" method="post">
Employeed id : <input type="text" name="id"><br><br>
<input id="i1" type="submit" value="submit">
</form>
</div>
</body>
</html>
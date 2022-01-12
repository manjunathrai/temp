<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
form{
            
            padding: 10px;
            width: 23%;
            margin: auto;
            height: 150px;
            background-repeat: no-repeat;
            background-size: cover;

        }
        input{
            float: right;
        }
        #i1{
        float: inherit;
        }
</style>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body bgcolor="grey">
<h1>Enter the update details</h1>
<hr>
<form action="./update" method="post">
Emp_id <input type="text" name="id"><br><br>
<input id="i1" type="submit" value="Update">
</form>
</body>
</html>
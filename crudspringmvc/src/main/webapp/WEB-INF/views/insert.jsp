<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
 h1{
            font-size: 50px;
            text-align: center;
        }
form{
            border: 2px solid black;
            padding: 10px;
            width: 23%;
            margin: auto;
            height: 300px;
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
<title>Registration Page</title>
</head>
<body bgcolor="grey">
<h1>Registration Page</h1>
<hr>
<h1></h1>
	<div>
	<form action="./add" method="post">
	First Name : <input type="text" name="firstname"><br><br>
	Last Name : <input type="text" name="lastname"><br><br>
	Designation : <input type="text" name="designation"><br><br>
	Salary : <input type="number" name="salary"><br><br>
	Email Id : <input type="email" name="email"><br><br>
	Date of Joining : <input type="date" name="doj"><br><br>
	<input id="i1" type="submit" value="Register">
	</form>
	</div>
</body>
</html>
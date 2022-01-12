<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
 h1{
            font-size: 50px;
            text-align: center;
        }
        form{
            border: 2px solid black;
            padding: 10px;
            width: 35%;
            margin: auto;
            height: 225px;
            background-size: cover;

        }
        input{
            float: right;
        }
        form{
        background-color: fuchsia;
        }
        
</style>
</head>
<body>
<div>
<form action="./register" method="post">
Name  <input type="text" name="name" placeholder="Enter Your Name" required="required"><br><br>
Phone Number  <input type="tel" name="phone" placeholder="Enter your Number" required="required" maxlength="10" ><br><br>
Email Id <input type="email" name="email"
				placeholder="Enter Your Email" required="required"><br><br>
Password  <input type="password" name="pass" placeholder="Enter Your Password" required="required"><br><br>
Re-Enter Password  <input type="text" name="re_pass" placeholder="Enter Your Password again" required="required"><br><br>
<input id="in" type="submit" value="Register" >

</form>
</div>

</body>
</html>
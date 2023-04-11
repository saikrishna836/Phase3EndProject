<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes-Admin Login</title>
</head>
<body>
	<center>
	<h1>Welcome to Sporty Shoes Admin Login Page</h1>
	<form action="adminvalidation">
	<table>
		<tr><td>Email</td><td><input type="text" name="email"/></td></tr>
		<tr><td>Password</td><td><input type="password" name="password"/></td></tr>
		<tr><td><input type="submit" value="Login"/></td></tr>
		</table>
	</form>
	<form action="passwordpage">
	<table><tr><td><input type="submit" value="change password"/></td></tr></table>
	</form>
	</center>
		<p>${message}</p>
</body>
</html>
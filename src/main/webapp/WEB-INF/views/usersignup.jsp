<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes-User SignUp</title>
</head>
<body>
	<center>
		<h1>Sporty Shoes User SignUp</h1>
	</center>
	<form action="adduser">
		<center>
			<table>
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="Email" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="SignUp" /></td>
				</tr>
			</table>
		</center>
	</form>
	<p>${message }</p>
</body>
</html>
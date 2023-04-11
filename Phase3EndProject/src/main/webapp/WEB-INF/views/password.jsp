<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes-Password Changing</title>
</head>
<body>
<center>
<h1>Password Changing</h1>
	<form action="password">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Old Password:</td>
				<td><input type="password" name="old_password" /></td>
			</tr>
			<tr>
				<td>New Password:</td>
				<td><input type="password" name="new_password" /></td>
			</tr>
			<tr>
				<td>Confirm New Password:</td>
				<td><input type="password" name="c_new_password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Change Password" /></td>
			</tr>
		</table>
	</form>
	</body></center>
	<p>${message }</p>
</body>
</html>
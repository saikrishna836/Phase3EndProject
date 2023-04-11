<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes-Admin Page</title>
</head>
<body>
<center>	
<h1>Welcome ${name} to Admin Page</h1>
<form action="productsmanage" method="post">
<input type="submit" value="Manage Products"/>
</form><br>
<form action="getbyname">
<input type="submit" value="Categorize Products"/>
</form><br>
<form action="manageUsers">
<input type="submit" value="Manage Users"/>
</form>
<form action="adminreports">
<input type="submit" value="Generate Purchase Reports"/>
</form>
</center>
<p>${message}</p>
</body>
</html>
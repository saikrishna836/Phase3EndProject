<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes-User Management</title>
</head>
<body>
<center>
<form action="getAllUsers" method="post">
<input type="submit" value="Get Users List"/>
</form>
<h5>Search User:</h5>
<form action="searchusers" >
<table><tr><td>Enter Id to search:</td><td><input type="number" name="id"/></td><td><input type="submit" value="search"/></td></tr></table>
</form></center>
<p>${message }</p>
</body>
</html>
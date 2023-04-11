<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoe-User Management</title>
</head>
<body>
<center>
<h1>${message}</h1>
<table>
			<tr><td>User Id</td><td>|</td><td>User Name</td><td>|</td><td>Email</td></tr>
			<c:forEach items="${users}" var="user">
				<tr><td>${user.id}</td><td>|</td><td>${user.name }</td><td>|</td><td>${user.email }</td></tr>
			</c:forEach>
</table>
</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes-Payment</title>
</head>
<body>
<center>
<center>
<h1>Payment</h1>
<form action="reports" method="post">
	<h3>Confirm The Payment of ${product.price} </h3>
	<p>${product.id}</p>
	<input type="hidden" name="p_id" value="${product.id}"/>
	<input type="hidden" name="u_id" value="${u_id}"/>
	
	
	<input type="submit" value="Yes"/>
</form>
<form action="userpage">
	<input type="submit" value="No"/>
</form>
</center>
</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoe-User Menu Space</title>
</head>
<body>
	<center>
		<h1>Welcome to Menu Space</h1>
		<table>
			<tr>
				<td>Product Id</td>
				<td>|</td>
				<td>Product Name</td>
				<td>|</td>
				<td>Product Brand</td>
				<td>|</td>
				<td>Gender</td>
				<td>|</td>
				<td>Product Size</td>
				<td>|</td>
				<td>Product Price</td>
			</tr>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>|</td>
					<td>${product.prodname }</td>
					<td>|</td>
					<td>${product.brand }</td>
					<td>|</td>
					<td>${product.gender }</td>
					<td>|</td>
					<td>${product.size}</td>
					<td>|</td>
					<td>${product.price }</td>
				</tr>
			</c:forEach>
		</table>
		<form action="payment" method="get">
			<input type="hidden" name="u_id" value="${user.id}" />
			<table>
				<tr>
					<td>Enter The Id of the product:</td>
					<td><input type="number" name="id" /></td>
					<td><input type="submit" value="Buy" /></td>
				</tr>
			</table>
		</form>
	</center>
	<p>${message }</p>
</body>
</html>
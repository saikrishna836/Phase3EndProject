<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes-${title}</title>
</head>
<body>
	<center>
		<form action="getbyname">
			<table>
				<tr>
					<td><input type="submit" value="Categorize by Name" /></td>
				</tr>
			</table>
		</form>
		<form action="getbybrand">
			<table>
				<tr>
					<td><input type="submit" value="Categorize by Brand" /></td>
				</tr>
			</table>
		</form>
		<form action="getbygender">
			<table>
				<tr>
					<td><input type="submit" value="Categorize by Gender" /></td>
				</tr>
			</table>
		</form>
		<form action="getbysize">
			<table>
				<tr>
					<td><input type="submit" value="Categorize by Size" /></td>
				</tr>
			</table>
		</form>
		<h1>${heading }</h1>
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
	</center>
</body>
</html>
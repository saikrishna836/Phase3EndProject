<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes-Add Product</title>
</head>
<body>
	<h2>Hey Buddy Enter the Product details to be added</h2>
	<form action="productaddition" method="post">
		<tr>
			<td>Product Name</td>
			<td><input type="text" name="prodname"></td>
		</tr>
		<tr>
			<td>Brand</td>
			<td><input type="text" name="brand"></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="text" name="gender"></td>
		</tr>
		<tr>
			<td>Size</td>
			<td><input type="number" name="size"></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><input type="double" name="price"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Add Product" /></td>
		</tr>
	</form>
</body>
</html>
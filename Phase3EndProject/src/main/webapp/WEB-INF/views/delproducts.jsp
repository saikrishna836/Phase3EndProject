<%@page language="java" contentType="text/html" isELIgnored="false" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes-Delete Product</title>
</head>
<body>
<h2>Hii Buddy select The Product to delete</h2>
<ul>
<c:forEach items="${products}" var="product">
<li>${product.id}|${product.prodname } |${product.brand } |${product.gender } |${product.size} |${product.price }</li>
</c:forEach>
</ul>
<form action="productdeletion">
<table>
<tr><td>Enter Id to delete</td><td><input type="number" name="Id"/></td></tr>
<tr><td><input type="submit" value="Delete Product"/>
</table>
</form>
</body>
</html>
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
	<form action="reports" >
				<table>
					<tr>
						<td>Account no:</td>
						<td><input type="number" /></td>
					</tr>
					<tr>
						<td>Select Bank</td>
						<td><select name="bank" id="bank">
								<option value="SBI">SBI</option>
								<option value="HDFC">HDFC</option>
								<option value="Corporation Bank">Corporation Bank</option>
								<option value="ICICI">ICICI</option>
						</select></td>
					</tr>
					<tr>
						<td>IFSC Code</td>
						<td><input type="number" /></td>
					</tr>
				</table>
				<h3>Confirm The Payment of ${product.price}</h3>
				<p>${product.id}</p>
				<input type="hidden" name="p_id" value="${id}" /> 
				<input type="hidden" name="u_id1" value="${u_id}" />
				 <input type="submit" value="Yes" />
			</form></br>
			<form action="paymentscancel">
				<input type="submit" value="No" />
			</form>
		</center>
	</center>
	<p>${message}</p>
</body>
</html>
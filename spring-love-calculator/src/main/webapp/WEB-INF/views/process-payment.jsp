<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Process Payment</title>
<style>
	#paymentDiv {
		text-align: center;
	}
	
</style>
</head>
<body>
<h1 align="center">BILL</h1>
	<div id="paymentDiv">
	
	<h3>BILL AGAINST THE CREDIT CARD NUMBER</h3>
	<p>${userPayment.creditCardNum} for an amount of ${userPayment.paymentAmount} has been generated</p>
		
	</div>
			

</body>
</html>
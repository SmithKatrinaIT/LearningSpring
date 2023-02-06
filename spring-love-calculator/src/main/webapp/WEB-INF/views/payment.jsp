<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Process Payment</title>
<style>
	#paymentDiv,
	#paymentBtn {
		display: flex;
		justify-content: center;
		
			
	}
	#paymentAmount,
	#creditCardNum {
		width: 300px;
		height: 30px;
		margin-bottom: 15px;		
	}
	label{
		display: inline-block;
		width: 150px;
		text-align: center;
		font-size: 20px;
		
	}
	#paymentBtn input {
		width: 100px;
		height: 30px;
		background-color: #34b4eb;
		color: #fff;
		
	}
	
</style>
</head>
<body>
<h1 align="center">BILL</h1>
	<div id="paymentDiv">
		

		<form:form action="process-payment" method="post"
			modelAttribute="userPayment">
			<label for="creditCardNum">Card Number: </label>
			<form:input id="creditCardNum" path="creditCardNum"/> <br>
			
			<label for="paymentAmount">Amount: </label>
			<form:input id="paymentAmount" path="paymentAmount" /> <br>
			
			<div id="paymentBtn">
				<input type="submit" id="payBill" value="PAY BILL" />
			</div>
			
		</form:form>
	</div>
			

</body>
</html>
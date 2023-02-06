<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<style type="text/css">
	.errors {
		color: red;	
		position: fixed;
		text-align: left;
		margin-left: 30px;	
	}
</style>


<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById("yn").value;
		if(userName.length < 3){
			alert("Your Name should have be between 3-15 characters");
			return false;
		}
		return true;		
	}
</script>

</head>
<body>
<!-- Spring MVC Form Tags allow for 2-way Data binding with DTO's and the model
	 the view requires the following insert: <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	 in order to access the 'modelAttribute' element on the form:form tag
	 
	 The to use the DTO properties in the form:input utilizes 'path' element and not the 'name' element  
	 	the 'path' value has to match the DTO property/variable
	 	remove the type
	 -->
	
	<h1 align="center">Love Calculator</h1>
	<hr>
	<form:form action="process-homepage" method="get" modelAttribute="userInfo" >
	<div align="center">
		<p>
			<label for="yn">Your Name: </label> 
			<form:input id="yn" path="userName"  />
			<form:errors path="userName" cssClass="errors"></form:errors>
			
		</p>
		<p>
			<label for="cn">Crush Name: </label> 
			<form:input id="cn" path="crushName"/>
			<form:errors path="crushName" cssClass="errors"></form:errors>
		</p>
		
		<p><form:checkbox path="termAndCondition" id="check"/>
		<label>I am agreeing that this is for fun</label>
		<form:errors path="termAndCondition" cssClass="errors"></form:errors>
		</p>
		
		
		<input type="submit" value="calculate"> 
		</form:form>
	</div>
	<br><br>
	
	<div align="center">Need to Register? <a href="/spring-love-calculator/register">Click Here to Register!</a></div>
</body>
</html>
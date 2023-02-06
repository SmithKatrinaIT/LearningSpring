<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>


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
	<form:form action="process-homepage" method="get" modelAttribute="userInfo">
	<div align="center">
		<p>
			<label for="yn">Your Name: </label> 
			<form:input id="yn" path="userName"  />
		</p>
		<p>
			<label for="cn">Crush Name: </label> 
			<form:input id="cn" path="crushName"/>
		</p>
		<input type="submit" value="calculate"> 
		</form:form>
	</div>
	<br><br>
	
	<div align="center">Need to Register? <a href="/spring-love-calculator/register">Click Here to Register!</a></div>
</body>
</html>
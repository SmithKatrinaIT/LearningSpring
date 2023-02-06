<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
	div {
		width: 60%;
		margin: auto;
		height: 600px;
		padding-left: 10px;
		border: 3px solid green;
		
	}
	table {
		width: 100%;
		padding: 15px;
		
	}
	input {
		height: 25px;
		 
	}
	input [type:checkbox] {
		width: 100px;
	}
	
	table td:first-child {
		width: 120px;	
	}
	table tr {
		width: 90%;
	}
	table td {
		text-align: left;
	}
	#cbTable {
		width: 100%;
		padding-left: 15px;
	
	}
	.cb:first-child {
		width: 100px;
		margin-right: 10px;
	}
	
	.cb {
		width: 100px;
		text-align: left;
	}
	
	.gender {
		width: 100px;
		background-color: pink ;
	}
	input:is([type="submit"]) {
		margin-left: 15px;
		height: 40px;
		font-size: 16px;
			
	}
	
</style>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<div id="reg">
	<h2 align="center">Please Register Here</h2>
	
	<form:form action="registration-success" method="get" modelAttribute="userData">
		<table>
			<tr>
				<td><label for="fn">Name:</label></td>
				<td colspan="2"><form:input id="fn" path="fullName"/></td>
			</tr>
			<tr>
				<td><label for="un">User Name:</label></td>
				<td colspan="2"><form:input id="un" path="userName"/></td>
			</tr>
			<tr>
				<td><label for="pw">Password:</label></td>
				<td colspan="2"><form:password id="pw" path="password"/></td>
			</tr>
			<tr>
				<td><label>Country:</label></td>
				<td>
					<form:select path="country">
						<form:option value="usa" label="United States"></form:option>
						<form:option value="ind" label="India"></form:option>
						<form:option value="capecod" label="Cape Cod"></form:option>
						<form:option value="bra" label="Brazil"></form:option>
						<form:option value="can" label="Canada"></form:option>
					</form:select>
				</td>
			</tr>
			<tr>
				<table id="cbTable">
					<tr>
						<td class="cb"><label>Hobbies?: </label></td>
						<td class="cb">Cricket:<br> <form:checkbox path="hobby" value="cricket"/><td>
						<td class="cb">Programming:<br> <form:checkbox path="hobby" value="programming"/><td>
						<td class="cb">Motorcycles:<br> <form:checkbox path="hobby" value="motorcycle"/><td>
						<td class="cb">Reading:<br> <form:checkbox path="hobby" value="reading"/><td>
					</tr>
				</table>
			</tr>
			<tr>
				<td class="gender">&nbsp;&nbsp;&nbsp;&nbsp;<label>Gender&nbsp;&nbsp;&nbsp;&nbsp;</label></td>
				<td>Male<form:radiobutton path="gender" value="male"/> &nbsp;&nbsp;Female<form:radiobutton path="gender" value="female"/>
				</td>
			</tr>
		</table>
		<br><br><br>
	<input type="submit" value="register" />
	</form:form>
	</div>
</body>	
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Completed</title>
</head>
<body>
<div>
<h1>Your Registration was Successful</h1>
<h2>Your registration details are:</h2>
Name: ${userData.fullName} <br>
User Name: ${userData.userName} <br>
Password: ${userData.password} <br>
Country: ${userData.country} <br>
Hobbies: 
<c:forEach var="temp" items="${userData.hobby}">
	${temp}	
</c:forEach>
<br>
Gender: ${userData.gender} <br>
Email: ${userData.userCommDTO.email} <br>
Phone: ${userData.userCommDTO.phone}

</div>
</body>
</html>
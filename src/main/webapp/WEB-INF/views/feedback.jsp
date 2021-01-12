<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Feedback</title>
</head>
<body>
	<h1 style="color:blue"><marquee behavior="alternate"> Feedback</marquee></h1>
<ul>
	<c:forEach items="${feedbacklist}" var="feedback">
		<li>${feedback.message}</li>
	</c:forEach>
	<a href="/feedback">Search Users</a>

</ul>
</body>
</html>
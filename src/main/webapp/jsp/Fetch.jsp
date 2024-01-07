<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch</title>
</head>
<body>
<h3>${pass }</h3>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Mobile</th>
			<th>Dob</th>
			<th>Maths</th>
			<th>Science</th>
			<th>English</th>
			<th>Percentage</th>
			<th>Result</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="student" items="${list}">
			<tr>
				<th>${student.name }</th>
				<th>${student.mobile }</th>
				<th>${student.dob }</th>
				<th>${student.maths }</th>
				<th>${student.science }</th>
				<th>${student.english }</th>
				<th>${student.percentage }</th>
				<th>${student.result }</th>
				<th><a href="edit?id=${student.id }"><button>Edit</button></a></th>
				<th><a href="delete?id=${student.id}"><button>Delete</button></a></th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

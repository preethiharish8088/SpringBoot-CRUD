<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
</head>
<body>
	<form action="update" method="post">
		<input type="hidden" name="id" value="${student.id }"> Name:<input
			type="text" name="name" value="${student.name}"><br>
		Mobile:<input type="text" name="mobile" value="${student.mobile }"><br>
		Dob:<input type="date" name="dob" value="${student.dob }"><br>
		Marks<br> Maths:<input type="text" name="maths"
			value="${student.maths }"><br> Science:<input
			type="text" name="science" value="${student.science }"><br>
		English:<input type="text" name="english" value="${student.english }"><br>
		<button>Update</button>
		<button type="reset">Cancel</button>
	</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div {
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
}
</style>
</head>
<body>
	<div>
		<h1>Insert Data</h1>
		<form action="insert" method="post">
			<fieldset>
				<legend>Enter Details here,</legend>
				<table>
					<tr>
						<th> Name:</th>
						<th><input type="text" name="name"></th>
					</tr>
					<tr>
						<th>Mobile number</th>
						<th><input type="number" name="mobile"></th>
					</tr>
					<tr>
						<th>DOB</th>
						<th><input type="date" name="dob"></th>
					</tr>
					<tr>
						<th>Maths</th>
						<th><input type="text" name="maths"></th>
					</tr>
					<tr>
						<th>English</th>
						<th><input type="text" name="english"></th>
					</tr>
					<tr>
						<th>Science</th>
						<th><input type="text" name="science"></th>
					</tr>
					
					<tr>
						<th><button>Add</button></th>
						<th><button type="reset">Cancel</button></th>
					</tr>
				</table>
			</fieldset>
		</form>
		<br> <br>
		<a href="/"><button>Back</button></a>
	</div>

</body>
</html>
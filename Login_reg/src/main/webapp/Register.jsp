<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>
<body>
	<form action="usercontrol" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>gender</td>
				<td><input type="radio" name="gender" value="male" /> Male<input
					type="radio" name="gender" value="female" />Female</td>
			</tr>
			<tr>
				<td>Date Of Birth</td>
				<td><input type="date" name="dob" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="register" /></td>
			</tr>


		</table>
	</form>
	
	
</body>
</html>
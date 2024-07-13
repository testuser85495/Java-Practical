<%@page import="model.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
	<%
	user u = (user) request.getAttribute("data");
	%>
	<form action="userarea" method="post">
		<table>

			<tr>
				<td><input type="hidden" name="id" value="<%=u.getId()%>"></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name" value="<%=u.getName()%>"></td>
			</tr>
			<tr>

				<td>Email :</td>
				<td><input type="email" name="email" value="<%=u.getEmail()%>">
				</td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="text" name="password"
					value="<%=u.getPassword()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>
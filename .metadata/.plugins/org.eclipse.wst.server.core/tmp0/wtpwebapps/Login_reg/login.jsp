<%@page import="Model.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null){
	out.print(msg);
}
String msg1 = (String)request.getAttribute("msg1");
if(msg1!=null){
	out.print(msg1);
}
%>

<body>
	<form action="usercontrol" method="post">
		<table>
			
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="Login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
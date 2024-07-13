<%@page import="Model.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	user u = null;
	if (session.getAttribute("data") != null) {
		u = (user) session.getAttribute("data");
	} else {
		response.sendRedirect("login.jsp");
	}
	%>
	<table border="1">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>email</td>
			<td>gender</td>
			<td>dob</td>
			<!-- <td colspan="2">Action</td> -->
		</tr>
		<tr>
			<td><%=u.getId()%></td>
			<td><%=u.getName()%></td>
			<td><%=u.getEmail()%></td>
			<td><%=u.getGender()%></td>
			<td><%=u.getDob()%></td>
			<!-- <td><a href="#">Edit</a></td>
			<td><a href="#">Delete</a></td> -->
		</tr>
	</table>
	<h2><a href="index.jsp">Index</a></h2>
</body>
</html>
<%@page import="Doa.Userdoa"%>
<%@page import="java.util.List"%>
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
	<h2>
		<a href="login.jsp">Login</a>
	</h2>
	<h2>
		<a href="Register.jsp">Register</a>
	</h2>
	<%
	user u = null;
	if (session.getAttribute("data") != null) {
		u = (user) session.getAttribute("data");
	} else {
		response.sendRedirect("login.jsp");
	}
	%>
	<table border="1">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Email</td>
				<td>Gender</td>
				<td>DOB</td>
				<td colspan="2">Action</td>
			</tr>
		</thead>
		<tbody>
			<%
			List<user> list = Userdoa.alluser();
			%>
			<%
			for (user l : list) {
			%>
			<tr>
				<td><%=l.getId()%></td>
				<td><%=l.getName()%></td>
				<td><%=l.getEmail()%></td>
				<td><%=l.getGender()%></td>
				<td><%=l.getDob()%></td>
				<td><a href="#">Edit</a></td>
				<td><a href="Delete.jsp?id=<%=u.getId()%>">Delete</a></td>

			</tr>
		</tbody>
		<%
		}
		%>
	</table>
</body>
</html>
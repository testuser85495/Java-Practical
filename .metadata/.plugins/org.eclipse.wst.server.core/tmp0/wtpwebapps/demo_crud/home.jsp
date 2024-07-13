<%@page import="doa.userdoa"%>
<%@page import="java.util.List"%>
<%@page import="model.user"%>
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
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0"); //prevents caching at the proxy server
	%>
	<%
	user u = null;
	if (session.getAttribute("data") != null) {
		u = (user) session.getAttribute("data");
	}
	%>
	<h1>User Data</h1>
	<h3>
		Id :
		<%=u.getId()%></h3>
	<h3>
		Name :
		<%=u.getName()%></h3>
	<h3>
		Contact :
		<%=u.getContact()%></h3>
	<h3>
		Address :
		<%=u.getAddress()%></h3>
	<h3>
		Email :
		<%=u.getEmail()%></h3>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Contact</th>
			<th>Password</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%
		List<user> list = userdoa.alluser();
		%>
		<tbody>
			<%
			for (user u1 : list) {
			%>
			<tr>
				<td><%=u1.getId()%></td>
				<td><%=u1.getName()%></td>
				<td><%=u1.getEmail()%></td>
				<td><%=u1.getAddress()%></td>
				<td><%=u1.getContact()%></td>
				<td><%=u1.getPassword()%></td>
				<td><form action="userarea" method="post">
						<input type="hidden" name="id" value="<%=u1.getId()%>"> <input
							type="submit" value="edit" name="action">
					</form></td>
				<td>
					<form action="userarea" method="post">
						<input type="hidden" name="id" value="<%=u1.getId()%>"> <input
							type="submit" value="delete" name="action">
					</form>
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<h3>
		<a href="logout.jsp">Logout</a>
	</h3>
</body>
</html>
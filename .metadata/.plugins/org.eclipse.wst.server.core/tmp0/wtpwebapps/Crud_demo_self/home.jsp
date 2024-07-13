<%@page import="DAO.userdao"%>
<%@page import="java.util.List"%>
<%@page import="model.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

.scriptlet {
	color: red;
	text-align: center;
}
</style>
<body>
	<%
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0"); //prevents caching at the proxy server
	%>
	<%-- 	<%
	user u1 = null;
	if (session.getAttribute("data") != null) {
		u1 = (user) session.getAttribute("data");
	}
	%> --%>
	<h3 class="scriptlet">
		<%
		user u = null;
		if (session.getAttribute("data") != null) {
			u = (user) session.getAttribute("data");
		}
		%>
	</h3>
	<table border="1">
		<tr>
			<th colspan="2">User Data</th>
		</tr>
		<tr>
			<td>ID</td>
			<td><%=u.getId()%></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><%=u.getName()%></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><%=u.getEmail()%></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><%=u.getPassword()%></td>
		</tr>

	</table>

	<table cellspacing="20">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%
		List<user> list = userdao.alluser();
		%>
		<tbody>
			<%
			for (user u1 : list) {
			%>
			<tr>
				<td><%=u1.getId()%></td>
				<td><%=u1.getName()%></td>
				<td><%=u1.getEmail()%></td>
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
	<h3><a href="logout.jsp">logout</a></h3>

</body>
</html>
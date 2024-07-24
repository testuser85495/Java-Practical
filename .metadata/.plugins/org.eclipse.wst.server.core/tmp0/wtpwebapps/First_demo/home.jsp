<%@page import="java.util.Arrays"%>
<%@page import="Model.user"%>
<%@page import="dao.Userdao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font-awesome -->
<!-- <link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css"> -->
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	<!-- cdn script and link for icofonts (icons) -->
	<script src="https://cdn.jsdelivr.net/npm/icofont@1.0.0/main.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/icofont@1.0.0/dist/icofont.min.css" rel="stylesheet">

<!-- cdn script and link for coreuiicons (icons -->)
<!-- <script src="https://cdn.jsdelivr.net/npm/@coreui/icons@3.0.1/dist/cjs/index.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/@coreui/icons@3.0.1/css/all.min.css" rel="stylesheet"> -->



<title>Home Page</title>
</head>
<body>
	<h4>
		<a class="d-grid gap-2 col-6 mx-auto btn btn-primary mt-5"
			href="index.jsp">Register</a>
	</h4>
	<div class="container">
		<table class="table table-bordered border-primary">
			<thead>
				<tr>
					<th colspan="9" class="text-center table-primary"><h4>User-list</h4></th>
				</tr>
				<tr class="text-center">
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Password</th>
					<th scope="col">Address</th>
					<th scope="col">Country</th>
					<th scope="col">Gender</th>
					<th scope="col">Hobbies</th>
					<th scope="col">Action</th>

				</tr>
			</thead>
			<%
			List<user> ulist = Userdao.getAllUser();
			%>
			<%
			for (user u : ulist) {
			%>
			<tbody class="text-center">
				<tr>
					<td><%=u.getId()%></td>
					<td><%=u.getName()%></td>
					<td><%=u.getEmail()%></td>
					<td><%=u.getPassword()%></td>
					<td><%=u.getAddress()%></td>
					<td><%=u.getCountry()%></td>
					<td><%=u.getGender()%></td>
					<%String hobbies= String.join(", ", u.getHobbies());%>
					<td><%=hobbies%></td>
					<td><a href="edit.jsp?id=<%=u.getId()%>"><i class="icofont-edit-alt me-4"></i></a> <a
						href="delete.jsp?id=<%=u.getId()%>"><i class="icofont-ui-delete"></i>
						
						
						
						</a></td>
				</tr>
			</tbody>
			<%
			}
			%>
		</table>
	</div>
</body>
</html>
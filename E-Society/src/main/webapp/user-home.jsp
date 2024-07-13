<%@page import="doa.MantanceDOA"%>
<%@page import="model.Mantance"%>
<%@page import="doa.ComplainDOA"%>
<%@page import="model.Complain"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="user-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Home</title>
<style>
 .table {
	text-align: center;
} 
</style>
</head>
<body>

	<%
	User user = null;
	if (session.getAttribute("data") != null) {
		user = (User) request.getAttribute("data");
	} else {
		response.sendRedirect("user-login.jsp");
	}
	%>
	<header class="section background-white">
		<div class="line text-center">
			<h1
				class="text-dark text-s-size-30 text-m-size-40 text-l-size-headline text-thin text-line-height-1">Be
				More with Less</h1>
			<p class="margin-bottom-0 text-size-16 text-dark">
				Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse
				molestie consequat, vel illum dolore eu feugiat nulla facilisis.<br>
				Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
				nonummy nibh euismod.
			</p>
		</div>
	</header>
	<h2>
		WELLCOME
		<%=u.getEmail()%></h2>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Email</th>
				<th scope="col">Contact</th>
				<th scope="col">Address</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td><%=u.getFname()%></td>
				<td><%=u.getLname()%></td>
				<td><%=u.getEmail()%></td>
				<td><%=u.getContact()%></td>
				<td><%=u.getAddress()%></td>
			</tr>
			<tr>
				<th scope="row">2</th>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>@fat</td>
			</tr>
			<tr>
				<th scope="row">3</th>
				<td>Larry</td>
				<td>the Bird</td>
				<td>@twitter</td>
			</tr>
		</tbody>
	</table>
	<%
	List<Complain> list = ComplainDOA.complainById(u.getId());
	%>
	<div class="line text-center">
		<table id="myTable"class="table">
			<thead>
				<tr>
					<th colspan="5" class="table-primary">Complain List</th>
				</tr>
				<tr>

					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Complain</th>
					<th scope="col">Date</th>
					<th scope="col">Status</th>
				</tr>
			</thead>
			<%
			for (Complain c : list) {
			%>
			<tbody>
				<tr>
					<!-- <th scope="row">1</th> -->
					<td><%=c.getName()%></td>
					<td><%=c.getEmail()%></td>
					<td><%=c.getComplain()%></td>
					<td><%=c.getDate()%></td>
					<td><%=c.getC_status()%></td>
				</tr>
			</tbody>
			<%
			}
			%>
		</table>
	</div>
	<%
	List<Mantance> mlist = MantanceDOA.mantanceListById(u.getId());
	%>
	<div class="line text-center">
		<table id="myTable"class="table">
			<thead>
				<tr>
					<th colspan="5" class="table-primary">Maintance List</th>
				</tr>
				<tr>

					<th scope="col">Name</th>
					<th scope="col">Date</th>
					<th scope="col">Maintenance Amount</th>
					<th scope="col">Remaning Amount</th>
					<th scope="col">Status</th>
				</tr>
			</thead>
			<%
			for (Mantance m : mlist) {
			%>
			<tbody>
				<tr>
					<!-- <th scope="row">1</th> -->
					<td><%=u.getFname()%></td>
					<td><%=m.getDate()%></td>
					<td><%=m.getMaintenance_Ammount()%></td>
					<td><%=m.getAmount() %></td>
					<td><%=m.getStatus()%></td>
				</tr>
			</tbody>
			<%
			}
			%>
		</table>
	</div>
</body>
</html>
<%@include file="footer.jsp"%>
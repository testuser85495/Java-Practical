<%@page import="doa.ComplainDOA"%>
<%@page import="model.Complain"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="user-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style>
 .table {
	text-align: center;
} 
</style>
<meta charset="UTF-8">
<title>User complainlist</title>
</head>
<body>
<header class="section background-white">
		<div class="line text-center">
			<h1
				class="text-dark text-s-size-30 text-m-size-40 text-l-size-headline text-thin text-line-height-1">
				Your Complain List</h1>
			<p class="margin-bottom-0 text-size-16 text-dark">
				Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse
				molestie consequat, vel illum dolore eu feugiat nulla facilisis.<br>
				Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
				nonummy nibh euismod.
			</p>
		</div>
	</header>
<%
	List<Complain> list = ComplainDOA.complainById(u.getId());
	%>
	<div class="line text-center">
		<table id="myTable"class="table">
			<thead>
				<tr>
					<th colspan="6" class="table-primary">Complain List</th>
				</tr>
				<tr>

					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Complain</th>
					<th scope="col">Complain Date</th>
					<th scope="col">Complete Date</th>
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
					<td><%=c.getCompletedate()%></td>
					<td><%=c.getC_status()%></td>
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
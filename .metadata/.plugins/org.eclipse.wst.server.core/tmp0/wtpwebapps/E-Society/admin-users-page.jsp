<%@page import="doa.UserDOA"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="admin-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
<style>
.table {
	text-align: center;;
}

.msglist, .userlist {
	border: 1px, solid, black;
	/* border-radius:20px; */
	margin: 20px;
	/* width: 50%; */
}

.tblpart {
	display: flex;
	justify-content: space-around;
	align-items: flex-start;
	/* min-width: max-content; */
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<header class="section background-white">
		<div class="line text-center">
			<h1
				class="text-dark text-s-size-30 text-m-size-40 text-l-size-headline text-thin text-line-height-1">
				Messages List</h1>
			<p class="margin-bottom-0 text-size-16 text-dark">
				Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse
				molestie consequat, vel illum dolore eu feugiat nulla facilisis.<br>
				Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
				nonummy nibh euismod.
			</p>
		</div>
	</header>
	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col" colspan="5" class="table-primary">PENDING MESSAGES</th>
			</tr>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Contact</th>
				<th scope="col">Status</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<%
		List<User> pendinglist = UserDOA.userPendingStatus();
		%>
		<%
		for (User u : pendinglist) {
		%>
		<tbody>
			<tr>
				<th scope="row"><%=u.getFname()%> <%=u.getLname()%></th>
				<td><%=u.getEmail()%></td>
				<td><%=u.getContact()%></td>
				<td><%=u.getStatus()%></td>
				<td><a style="color: DodgerBlue;"
					href="UserController?action=changestatus&emailid=<%=u.getEmail()%>">Confirm</a>
					|| <a style="color: red;"
					href="UserController?action=Rejectstatus&emailid=<%=u.getEmail()%>">Reject</a>
				</td>
			</tr>

		</tbody>
		<%
		}
		%>
	</table>

	<table class="table table-hover ">
		<thead>
			<tr>
				<th scope="col" colspan="5" class="table-primary">CONFIRM MESSAGES</th>
			</tr>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Contact</th>
				<th scope="col">Status</th>
			</tr>
		</thead>
		<%
		List<User> confirmlist = UserDOA.userConfirmStatus();
		%>
		<%
		for (User u : confirmlist) {
		%>
		<tbody>
			<tr>
				<th scope="row"><%=u.getFname()%> <%=u.getLname()%></th>
				<td><%=u.getEmail()%></td>
				<td><%=u.getContact()%></td>
				<td><%=u.getStatus()%></td>
				<%-- <td><a style="color: DodgerBlue;"
					href="UserController?action=changestatus&emailid=<%=u.getEmail()%>">Confirm</a>
					|| <a style="color: red;"
					href="UserController?action=Rejectstatus&emailid=<%=u.getEmail()%>">Reject</a>
				</td> --%>
			</tr>

		</tbody>
		<%
		}
		%>
	</table>
	<table class="table table-hover ">
		<thead>
			<tr>
				<th scope="col" colspan="5" class="table-primary">REJECT MESSAGES</th>
			</tr>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Contact</th>
				<th scope="col">Status</th>
			</tr>
		</thead>
		<%
		List<User> rejectlist = UserDOA.userRejectStatus();
		%>
		<%
		for (User u : rejectlist) {
		%>
		<tbody>
			<tr>
				<th scope="row"><%=u.getFname()%> <%=u.getLname()%></th>
				<td><%=u.getEmail()%></td>
				<td><%=u.getContact()%></td>
				<td><%=u.getStatus()%></td>
				<%-- <td><a style="color: DodgerBlue;"
					href="UserController?action=changestatus&emailid=<%=u.getEmail()%>">Confirm</a>
					|| <a style="color: red;"
					href="UserController?action=Rejectstatus&emailid=<%=u.getEmail()%>">Reject</a>
				</td> --%>
			</tr>

		</tbody>
		<%
		}
		%>
	</table>
	

</body>
</html>
<%@include file="footer.jsp"%>
<%@page import="doa.ComplainDOA"%>
<%@page import="model.Complain"%>
<%@page import="model.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="admin-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

</head>
<style>
.table{text-align: center;}
.modal-body {
	display: contents;
}

.card-counter {
	box-shadow: 2px 2px 10px #DADADA;
	margin: 5px;
	padding: 20px 10px;
	background-color: #e5e5e5;
	height: 100px;
	border-radius: 5px;
	transition: .3s linear all;
}

.card-counter:hover {
	box-shadow: 4px 4px 20px black;
	transition: .3s linear all;
}

.card-counter.primary {
	background-color: #007bff;
	color: #FFF;
}

/* .card-counter.danger {
	background-color: #ef5350;
	color: #FFF;
} */

 .card-counter.success {
	background-color: #007bff;
	color: #FFF;
} 

.card-counter.info {
	background-color: #26c6da;
	color: #FFF;
}

.card-counter i {
	color: white;
	align-items : center;
	font-size: 5em;
	opacity: 0.2;
	font-size: 4em;
}

.card-counter .count-numbers {
	color: white;
	position: absolute;
	right: 35px;
	top: 20px;
	font-size: 32px;
	display: block;
	position: absolute;
}

.card-counter .count-name {
	color: white;
	position: absolute;
	right: 28px;
	top: 65px;
	font-style: italic;
	text-transform: capitalize;
	opacity: 0.5;
	display: block;
	font-size: 18px;
}
</style>
<body>
	<%
	Admin admin = null;
	if (session.getAttribute("data") != null) {
		admin = (Admin) request.getAttribute("data");
	} else {
		response.sendRedirect("admin-login.jsp");
	}
	%>
	<!-- <header class="section background-white">
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
	</header> -->
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<%
				List<User> msglist = UserDOA.userPendingStatus();
				%>



				<div class="card-counter primary">
					<a href="#" data-bs-toggle="modal" data-bs-target="#myModal"> <i
						class="fa-regular fa-comments"></i><span class="count-numbers">
							<%
							out.print(msglist.size());
							%>
					</span> <span class="count-name">Messages</span>
					</a>
				</div>
				<!-- The Modal -->
				<div class="modal fade " id="myModal">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">

							<!-- Modal Header -->
							<div class="modal-header">
								<h4 class="modal-title">Register pending Message</h4>
								<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
							</div>


							<!-- Modal body -->
							<div class="modal-body">
								<table class="table">
									<thead>
										<tr>
											<th scope="col">Name</th>
											<th scope="col">Email</th>
											<th scope="col">Contact</th>
											<th scope="col">Status</th>
											<th scope="col">Action</th>
										</tr>
									</thead>
									<%
									for (User u : msglist) {
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
							</div>


							<!-- Modal footer -->
							<div class="modal-footer">
								<button type="button" class="btn btn-danger"
									data-bs-dismiss="modal">Close</button>
							</div>

						</div>
					</div>
				</div>
				<!-- The Modal end-->

			</div>
			<%
			List<User> userlist = UserDOA.allUsers();
			%>
			<div class="col-md-3">
				<div class="card-counter success">
					<a href="#" data-bs-toggle="modal" data-bs-target="#userModal">
						<i class="fa fa-database"></i> <span class="count-numbers">
							<%
							out.print(userlist.size());
							%>
					</span> <span class="count-name">Users</span>
					</a>
				</div>
			</div>

			<!-- The Modal -->
			<div class="modal fade  " id="userModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Users List</h4>
							<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
						</div>


						<!-- Modal body -->
						<div class="modal-body">
							<table class="table">
								<thead>
									<tr>
										<th scope="col">Name</th>
										<th scope="col">Email</th>
										<th scope="col">Contact</th>
										<th scope="col">Address</th>
										<th scope="col">Status</th>
										<!-- <th scope="col">Action</th> -->
									</tr>
								</thead>
								<%
								for (User u : userlist) {
								%>
								<tbody>
									<tr>
										<th scope="row"><%=u.getFname()%> <%=u.getLname()%></th>
										<td><%=u.getEmail()%></td>
										<td><%=u.getContact()%></td>
										<td><%=u.getAddress()%></td>
										<td><%=u.getStatus()%></td>
										<%-- <td><a style="color: DodgerBlue;"
												href="UserController?action=changestatus&emailid=<%=u.getEmail()%>">Confirm</a>
												<a style="color: red;"
												href="UserController?action=Rejectstatus&emailid=<%=u.getEmail()%>">Reject</a>
											</td> --%>
									</tr>

								</tbody>
								<%
								}
								%>
							</table>
						</div>


						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-danger"
								data-bs-dismiss="modal">Close</button>
						</div>

					</div>
				</div>
			</div>
			<!-- The Modal end-->
			

<%List<Complain> comlist=ComplainDOA.allComplain(); %>
			<div class="col-md-3">
				<div class="card-counter success">
					<a href="#" data-bs-toggle="modal" data-bs-target="#comModal">
						<i class="fa-solid fa-clipboard"></i> <span class="count-numbers">
							<%
							out.print(comlist.size());
							%>
					</span> <span class="count-name">Complains</span>
					</a>
				</div>
			</div>
			<!-- The Modal -->
				<div class="modal fade " id="comModal">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">

							<!-- Modal Header -->
							<div class="modal-header">
								<h4 class="modal-title">Complains list</h4>
								<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
							</div>


							<!-- Modal body -->
							<div class="modal-body">
								<table class="table">
									<thead>
										<tr>
										    <th scope="col">User ID</th>
											<th scope="col">Name</th>
											<th scope="col">Email</th>
											<th scope="col">Complain</th>
											<th scope="col">Complain Date</th>
											<th scope="col">Complete Date</th>
											<th scope="col">Status</th>
										</tr>
									</thead>
									<%
									for (Complain u : comlist) {
									%>
									<tbody>
										<tr>
										    <td><%=u.getUid()%></td>
											<th scope="row"><%=u.getName()%></th>
											<td><%=u.getEmail()%></td>
											<td><%=u.getComplain()%></td>
											<td><%=u.getDate()%></td>
											<td><%=u.getCompletedate()%></td>
											<td><%=u.getC_status()%></td>
											 <%-- <td><a style="color: DodgerBlue;"
												href="ComplainController?action=complainconfirm&emailid=<%=u.getEmail()%>">Confirm</a>
												|| <a style="color: red;"
												href="ComplainController?action=complainrejecte&emailid=<%=u.getEmail()%>">Reject</a>
											</td> --%>
										</tr>

									</tbody>
									<%
									}
									%>
								</table>
							</div>


							<!-- Modal footer -->
							<div class="modal-footer">
								<button type="button" class="btn btn-danger"
									data-bs-dismiss="modal">Close</button>
							</div>

						</div>
					</div>
				</div>
				<!-- The Modal end-->




			<div class="col-md-3">
				<div class="card-counter success">
					<i class="fa fa-database"></i> <span class="count-numbers">6875</span>
					<span class="count-name">Data</span>
				</div>
			</div>
		</div>
	</div>
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

</body>
</html>
<%@include file="footer.jsp"%>
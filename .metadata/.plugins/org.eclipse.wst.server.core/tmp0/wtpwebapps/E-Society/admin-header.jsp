<%@page import="doa.UserDOA"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page import="model.Admin"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Minimalista - New Amazing HTML5 Template</title>
<link rel="stylesheet" href="css/components.css">
<link rel="stylesheet" href="css/icons.css">
<link rel="stylesheet" href="css/responsee.css">
<link rel="stylesheet" href="owl-carousel/owl.carousel.css">
<link rel="stylesheet" href="owl-carousel/owl.theme.css">
<link rel="stylesheet" href="css/lightcase.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">
<!-- CUSTOM STYLE -->
<link rel="stylesheet" href="css/template-style.css">

<link
	href="https://fonts.googleapis.com/css?family=Work+Sans:100,400,600,900&subset=latin-ext"
	rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>

<title>Admin header</title>
<style>
.abc {
	position: top 100px;
}
</style>
</head>
<body class="size-1140">
	<%
	Admin a = null;

	if (session.getAttribute("data") != null) {
		a = (Admin) session.getAttribute("data");
	} else {
		response.sendRedirect("admin-login.jsp");
	}
	%>
	<!-- HEADER -->
	<div id="page-wrapper">
		<header role="banner"
			class=" margin-top-30 margin-m-top-0 margin-s-top-0">
			<!-- Top Navigation -->
			<nav
				class="background-transparent background-transparent-hightlight full-width sticky">
				<div class="s-12 l-2">
					<a href="admin-home.jsp" class="logo"> <!-- Logo version before sticky nav -->
						<img class="logo-before" src="img/e-society.png" alt="img">
						<!-- Logo version after sticky nav --> <img class="logo-after"
						src="img/e-society.png" alt="">
					</a>
				</div>
				<div class="s-12 l-10">
					<div class="top-nav right">
						<p class="nav-text"></p>
						<ul class="right chevron">


							<%-- <%
							List<User> list = UserDOA.userPendingStatus();
							%> --%>
							<%-- <%for(){ %> --%>

							<!-- <li><a href="#"><i class="fa-solid fa-envelope"></i> </a></li> -->
							<%-- <li><a href="#" data-bs-toggle="modal"
								data-bs-target="#myModal"> <i class="fa-solid fa-envelope"></i>
									<sup> <% out.print(list.size());  %>
								</sup></a></li> --%>

							<li><a href="admin-home.jsp">Home</a></li>
							<li><a href="admin-users-page.jsp">Users</a></li>
							<li><a href="admin-complainlist.jsp">Complains</a></li>
							<li><a href="admin-complainlist.jsp">Mantenance</a></li>

							<li class="dropdown"><a href="#"> <%=a.getName()%> <!-- <i
									class="fa-regular fa-user fa-xs"></i> --></a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="#">Change Password</a></li>
									<li><a class="dropdown-item" href="#">Another action</a></li>
									<li><a class="dropdown-item" href="#">Another Another
											Another </a></li>
								</ul></li>
							<li><a href="admin-logout.jsp">Logout <i
									class="fa-solid fa-power-off fa-xs"></i></a></li>

						</ul>
					</div>
				</div>
			</nav>
		</header>


		

		<!-- The Modal -->
		<%-- <div class="modal fade " id="myModal">
			<div class="modal-dialog">
				<div class="modal-content">

					<!-- Modal Header -->
					<div class="modal-header">
						<h4 class="modal-title">Message</h4>
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
							for (User u : list) {
							%>
							<tbody>
								<tr>
									<th scope="row"><%=u.getFname()%> <%=u.getLname()%></th>
									<td><%=u.getEmail()%></td>
									<td><%=u.getContact()%></td>
									<td><%=u.getStatus()%></td>
									<td><a style="color:DodgerBlue;" href="UserController?action=changestatus&id=<%=u.getId()%>">Confirm</a></td>
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
		</div> --%>
		<!-- The Modal end-->

	</div>
</body>
</html>
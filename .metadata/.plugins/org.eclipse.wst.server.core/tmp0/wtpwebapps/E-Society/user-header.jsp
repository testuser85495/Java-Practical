<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
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

</head>
<body>
<%User u = null;
if(session.getAttribute("data")!= null){
	u = (User)session.getAttribute("data");
}
else{
	response.sendRedirect("user-login.jsp");
}
%>
	<!-- HEADER -->
	<header role="banner"
		class="position-absolute margin-top-30 margin-m-top-0 margin-s-top-0">
		<!-- Top Navigation -->
		<nav
			class="background-transparent background-transparent-hightlight full-width sticky">
			<div class="s-12 l-2">
				<a href="user-home.jsp" class="logo"> <!-- Logo version before sticky nav -->
					<img class="logo-before" src="img/e-society.png" alt="img"> <!-- Logo version after sticky nav -->
					<img class="logo-after" src="img/e-society.png" alt="">
				</a>
			</div>
			<div class="s-12 l-10">
				<div class="top-nav right">
					<p class="nav-text"></p>
					<ul class="right chevron">
						<li><a href="user-home.jsp">Home</a></li>
						<li class="dropdown"><a href="#">Complains</a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="user-complain.jsp">Complain</a></li>
									<li><a class="dropdown-item" href="user-complainlist.jsp"> complain List</a></li>
								</ul></li>
						<li class="dropdown"><a href="#"><%=u.getFname() %> </a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="user-changepassword.jsp">Change Password</a></li>
									<li><a class="dropdown-item" href="user-mantenance.jsp">Maintenance</a></li>
									<li><a class="dropdown-item" href="#">Another Another
											Another </a></li>
								</ul></li>
							<li><a href="user-logout.jsp">Logout <i class="fa-solid fa-power-off fa-xs"></i></a></li>
						<li><a href="#">About Us</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
</body>
</html>

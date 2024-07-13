<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Minimalista - New Amazing HTML5 Template</title>
<link rel="stylesheet" href="css/components.css">
<link rel="stylesheet" href="css/icons.css">
<link rel="stylesheet" href="css/responsee.css">
<link rel="stylesheet" href="owl-carousel/owl.carousel.css">
<link rel="stylesheet" href="owl-carousel/owl.theme.css">
<link rel="stylesheet" href="css/lightcase.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">
<!-- CUSTOM STYLE -->
<link rel="stylesheet" href="css/template-style.css">

<link
	href="https://fonts.googleapis.com/css?family=Work+Sans:100,400,600,900&subset=latin-ext"
	rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
.msgalert {
	max-width: 35%;
}
</style>
<title>User Header</title>
</head>

<body class="size-1140">
	<!-- HEADER -->
	<div id="page-wrapper">
		<header role="banner"
			class="position-absolute margin-top-30 margin-m-top-0 margin-s-top-0">
			<!-- Top Navigation -->
			<nav
				class="background-transparent background-transparent-hightlight full-width sticky">
				<div class="s-12 l-2">
					<a href="user-index.jsp" class="logo"> <!-- Logo version before sticky nav -->
						<img class="logo-before" src="img/e-society.png" alt="img" > <!-- Logo version after sticky nav -->
						<img class="logo-after" src="img/e-society.png" alt="">
					</a>
				</div>
				<div class="s-12 l-10">
					<div class="top-nav right">
						<p class="nav-text"></p>
						<ul class="right chevron">
							<li><a href="user-index.jsp">Home</a></li>
							<li><a href="user-login.jsp">Sign in <i class="fa-solid fa-right-to-bracket fa-xs"></i></a></li>
							<li><a href="user-register.jsp">Sing up <i class="fa-solid fa-user-plus fa-xs"></i></a></li>
						</ul>
					</div>
				</div>
			</nav>
		</header>
	</div>
	<script type="text/javascript">
		window.setTimeout(function() {
			$(".alert").fadeTo(500, 0).slideUp(500, function() {
				$(this).remove();
			});
		}, 4000);
	</script>
</body>
</html>
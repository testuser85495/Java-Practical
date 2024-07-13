<%@ page  language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Password</title>
<style>
.btn {
	margin-top: 20px;
	width: 100%;
}

.form-control {
	height: 35px;
	border-radius: 10px;
	font-family: "Inter", sans-serif;
}

.contain {
	display: flex;
	align-items: center;
	justify-content: center;
	height: 310px;
	width: 50%;
}

.main {
	display: flex;
	align-items: center;
	justify-content: center;
}

.scriptlet {
	color: red;
	font-size: 10px;
}

.reg {
	margin-top: 20px;
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #3b5d50;
	min-width: 200px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	padding: 11px;
	z-index: 10;
	/* margin-left: 0px; */
}

.dropdown {
	position: relative;
	display: inline-block;
}
</style>
</head>
<body>

<!-- Start Header/Navigation -->
	<nav
		class="custom-navbar navbar navbar navbar-expand-md navbar-dark bg-dark"
		arial-label="Furni navigation bar">

		<div class="container">
			<a class="navbar-brand" href="index.html">Furni<span>.</span></a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarsFurni"
				aria-controls="navbarsFurni" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarsFurni">
				<ul class="custom-navbar-nav navbar-nav ms-auto mb-2 mb-md-0">
					<li class="nav-item "><a class="nav-link" href="index.jsp">Home</a>
					</li>
					<div class="dropdown">
						<li><a class="nav-link" href="#">Login</a></li>
						<div class="dropdown-content">
							<ul type="none">
								<li><a href="login.jsp" style="text-decoration: none;">cust-login</a></li>
							</ul>
							<ul type="none">
								<li><a href="sell-login.jsp" style="text-decoration: none;">sell-login</a></li>
							</ul>
						</div>
					</div>
					<div class="dropdown">
						<li><a class="nav-link" href="#">Register</a></li>
						<div class="dropdown-content">
							<ul type="none">
								<li><a href="register.jsp" style="text-decoration: none;">cust-Register</a></li>
							</ul>
							<ul type="none">
								<li><a href="sell-register.jsp"
									style="text-decoration: none;">sell-Register</a></li>
							</ul>
						</div>
					</div>
					<!-- <li><a class="nav-link" href="register.jsp">register</a></li>
						<li><a class="nav-link" href="login.jsp">login</a></li> -->
				</ul>

				<ul class="custom-navbar-cta navbar-nav mb-2 mb-md-0 ms-5">
					<li><a class="nav-link" href="#"><img
							src="images/user.svg"></a></li>
					<li><a class="nav-link" href="cart.html"><img
							src="images/cart.svg"></a></li>
				</ul>
			</div>
		</div>

	</nav>
	<!-- End Header/Navigation -->
	<div class="alert alert-light" role="alert">

		<h2 class="scriptlet">
			<%
			String msg = (String) request.getAttribute("msg");
			%>
			<%
			if (msg != null) {
				out.print(msg);
			%>
			<%
			}
			%>
		</h2>

	</div>
<form action="Customercontroller" method="post">
		<div class="main">
			<div class="contain">
				<div class="">
					<div class="">
					<%String email= (String)request.getAttribute("email"); %>
						<div class="form-group">
						 <input type="hidden" name="email" value="<%=email %>"> 
							<label class="text-black" for="lname">New Password</label> <input
								type="text" class="form-control" name="np" id="lname"
								placeholder="Enter Old Password">
						</div>
					</div>
					<div class="">
						<div class="form-group">
							<label class="text-black" for="lname">Confirm Password</label> <input
								type="password" class="form-control" name="cp" id="lname"
								placeholder="Enter Confirm Password">
						</div>
					</div>
					<button type="submit" class="cp btn btn-primary-hover-outline"
						name="action" value="change-forgot-pass">Change Password</button>
					
				</div>
			</div>
		</div>
	</form>
</body>
</html>
<%@include file="footer.jsp"%>
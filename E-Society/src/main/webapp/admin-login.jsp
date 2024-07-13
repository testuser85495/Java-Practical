<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="admin-main-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<!-- <script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script> -->
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> -->

<style>
.msgalert {
	width: 35%;
}
</style>
<body>
	<%
	String msg = (String) request.getAttribute("msg");
	String msg1 = (String) request.getAttribute("msg1");
	String msg2 = (String) request.getAttribute("msg2");
	%>
	<section class="section background-white">
<!-- msg for success register -->
		<%
		if (msg != null) {
		%>
		<div class="alert alert-success msgalert" role="alert">

			<strong>Success!</strong>
			<%
			out.print(msg);
			}
			%>
		</div>
		<!--Msg for worng email  -->
		<%
		if (msg1 != null) {
		%>
		<div class="alert alert-warning msgalert" role="alert">

			<strong>Warning!</strong>
			<%
			out.print(msg1);
			}
			%>
		</div>
		<!--Msg for worng password  -->
		<%
		if (msg2 != null) {
		%>
		<div class="alert alert-warning msgalert" role="alert">

			<strong>Warning!</strong>
			<%
			out.print(msg2);
			}
			%>
		</div>

		<div class="s-12 m-12 l-4 center">
			<h4 class="text-size-20 margin-bottom-20 text-dark text-center">Admin Login</h4>
			<form action="AdminController" class="customform" method="post">
				<div class="s-12">
					<input name="email" class="subject" placeholder="Your e-mail"
						title="your e-mail" type="email">
				</div>
				<div class="s-12">
					<input name="password" class="subject" placeholder="Enter Password"
						title="your password" type="password">
				</div>
				<div class="s-12">
					<a href="admin-forgotpassword.jsp">Forgot Password?</a>
				</div>

				<div class="s-12">
					<button name="action" value="login" class="s-12 submit-form button background-primary text-white" type="submit">Login</button>
				</div>
			</form>
		</div>
	</section>
	<!-- <script type="text/javascript">
		window.setTimeout(function() {
			$(".alert").fadeTo(500, 0).slideUp(500, function() {
				$(this).remove();
			});
		}, 4000);
	</script> -->
</body>
</html>
<%@include file="footer.jsp"%>
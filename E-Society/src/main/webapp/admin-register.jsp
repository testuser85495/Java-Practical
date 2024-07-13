<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="admin-main-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Register </title>
</head>
<style>.msgalert {

	max-width: 35%;
}</style>

<body>
	<%
	String msg = (String) request.getAttribute("msg");
	%>
	<section class="section background-white">
		<%
		if (msg != null) {
		%>
		<div class="alert alert-warning msgalert" role="alert">

			<strong>Warning!</strong>
			<%
			out.print(msg);
			}
			%>
		</div>
		<div class="s-12 m-12 l-4 center">
			<h4 class="text-size-20 margin-bottom-20 text-dark text-center">Admin
				Register</h4>
			<form action="AdminController" class="customform" method="post">
				<div class="s-12">
					<div class="margin">
						<div class="s-12 m-12 l-6">
							<input name="name" class="name" placeholder="Your name"
								title="Your name" type="text">
						</div>
						<div class="s-12 m-12 l-6">
							<input name="email" class="required email"
								placeholder="Your e-mail" title="Your e-mail" type="email">
						</div>
						<div class="s-12 m-12 l-6">
							<input name="contact" class="required email"
								placeholder="Your Contact" title="Your contact" type="text">
						</div>
						<div class="s-12 m-12 l-6">
							<input name="password" class="required password"
								placeholder="Your password" title="Your password"
								type="password">
						</div>
						<div class="s-12">
							<textarea name="address" class="required message"
								placeholder="Your Address" title="Your address" rows="3"></textarea>
						</div>
					</div>
				</div>
				<div class="s-12">
					<button name="action" value="register"
						class="s-12 submit-form button background-primary text-white"
						type="submit">Register</button>
				</div>
				<div class="s-12">
					<p>
						Have an account? <a href="admin-login.jsp">Login</a>
					</p>
				</div>
			</form>
		</div>
	</section>
</body>
</html>
<%@include file="footer.jsp"%>
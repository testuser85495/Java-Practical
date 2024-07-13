<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="user-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Complain</title>
</head>
<style>.msgalert {

	max-width: 35%;
}</style>
<body>
	<header class="section background-white">
		<div class="line text-center">
			<h1
				class="text-dark text-s-size-30 text-m-size-40 text-l-size-headline text-thin text-line-height-1">Say
				Your Complain</h1>
			<p class="margin-bottom-0 text-size-16 text-dark">
				Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse
				molestie consequat, vel illum dolore eu feugiat nulla facilisis.<br>
				Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
				nonummy nibh euismod.
			</p>
		</div>
	</header>
	<%
	String msg = (String) request.getAttribute("msg");
	String msg1 = (String) request.getAttribute("msg1");
	%>
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
	<div class="s-12 m-12 l-4 center">
		<h4 class="text-size-20 margin-bottom-20 text-dark text-center">Complain Form</h4>
		<form action="ComplainController" class="customform" method="post">
			<div class="s-12">
				<div class="margin">
				<input type="hidden" name="uid" value="<%=u.getId()%>">
					<div class="s-12 m-12 l-6">
						<input name="name" class="name" placeholder="Your Name"
							title="Your name" type="text">
					</div>
					<div class="s-12 m-12 l-6">
						<input name="email" class="required email"
							placeholder="Your e-mail" title="Your e-mail" type="email">
					</div>
					<div class="s-12">
						<textarea name="comlpain" class="required message"
							placeholder="Your Complain" title="Your Complain" rows="3"></textarea>
					</div>
				</div>
			</div>
			<div class="s-12">
				<button name="action" value="Complain"
					class="s-12 submit-form button background-primary text-white"
					type="submit">Complain</button>
			</div>
		</form>
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
<%@include file="footer.jsp"%>
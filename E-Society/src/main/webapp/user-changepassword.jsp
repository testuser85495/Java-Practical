<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="user-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
</head>
<style>.msgalert {

	max-width: 35%;
}</style>

<body>
	<%
	String msg = (String) request.getAttribute("msg");
	String msg1 = (String) request.getAttribute("msg1");
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
			<h4 class="text-size-20 margin-bottom-20 text-dark text-center">User Change Password</h4>
			<form action="UserController" class="customform" method="post">
			
				<div class="s-12">
					<div class="margin">
					<input type="hidden" name="id" value="<%=u.getId()%>">
						<div class="s-12">
							<input name="oldpassword" class="name" placeholder="Your Old Password"
								title="Your Old Password" type="text">
						</div>
						<div class="s-12">
							<input name="newpassword" class="name" placeholder="Your New Password"
								title="Your New Password" type="text">
						</div>
						<div class="s-12">
							<input name="cpassword" class="name" placeholder="Your Confirm Password"
								title="Your Confirm Password" type="text">
						</div>
					</div>
				</div>
				<div class="s-12">
					<button name="action" value="change password"
						class="s-12 submit-form button background-primary text-white"
						type="submit">Change Password</button>
				</div>
			</form>
		</div>
	</section>
	<script type="text/javascript">
		window.setTimeout(function() {
			$(".alert").fadeTo(500, 0).slideUp(500, function() {
				$(this).remove();
			});
		}, 4000);
	</script>
</body>
</html>
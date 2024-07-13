<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="user-main-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>



<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>

<style>
.msgalert {
	max-width: 35%;
}
.main {
	text-align: center;
	height: 500px;
	width: 100%;
	display: flex;
	text: center;
	align-content: center;
	align-items: center;
}

.wait {
	font-size: 20px;
	color: black;
}
</style>
<body>
	<%
	String msg = (String) request.getAttribute("msg");
	%>
	<div style="margin-top: 70px;">
	
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
	
	</div>
	
	<div class="main">
	<div></div>
		<div class="container">
			<h2>Wait</h2>
			<p>Wait until admin comfirm your request</p>

			<div class="spinner-grow text-muted">
				<p class="wait">P</p>
			</div>
			<div class="spinner-grow text-danger">
				<p class="wait">E</p>
			</div>
			<div class="spinner-grow text-secondary">
				<p class="wait">N</p>
			</div>
			<div class="spinner-grow text-warning">
				<p class="wait">D</p>
			</div>
			<div class="spinner-grow text-primary">
				<p class="wait">I</p>
			</div>
			<div class="spinner-grow text-success">
				<p class="wait">N</p>
			</div>
			<div class="spinner-grow text-info">
				<p class="wait">G</p>
			</div>


		</div>
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
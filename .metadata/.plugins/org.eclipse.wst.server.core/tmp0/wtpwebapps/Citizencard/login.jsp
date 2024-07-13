<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

body {
	background: #378CE7;
	overflow: hidden;
}

.title {
	height: 90px;
	background: #5356FF;
	border-radius: 5px 5px 0 0;
	color: #ffffff;
	font-size: 20px;
	display: flex;
	align-items: center;
	justify-content: center;
}

.container {
	max-width: 440px;
	padding: 0 20px;
	margin: 100px auto;
}

form {
	height: 290px;
	background: white;
	border-radius: 0 0 5px 5px;
	padding: 30px 25px 25px 25px;
}

.row {
	height: 45px;
	margin-bottom: 15px;
	position: relative;
}

.row i {
	position: absolute;
	width: 47px;
	height: 100%;
	color: #fff;
	font-size: 18px;
	background: #5356ff;
	border-radius: 5px 0 0 5px;
	display: flex;
	align-items: center;
	justify-content: center;
}

input {
	height: 100%;
	width: 100%;
	outline: none;
	padding-left: 60px;
	border-radius: 5px;
	border: 1px solid lightgrey;
	font-size: 16px;
	transition: all 0.3s ease;
}

.button input {
	color: #ffffff;
	font-size: 20px;
	font-weight: 500;
	padding-left: 0px;
	background: #5356ff;
	cursor: pointer;
}

.Register a:hover {
	text-decoration: underline;
}

.Register a {
	display: flex;
	decoration: none;
	flex-direction: column;
}

.Register { /* float: right; */
	margin-right: 3px;
	margin-top: 6px;
}

span {
	text-align: center;
}
</style>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status") %>" />
	<div class="container">
		<div class="title">
			<h1>LOGIN</h1>
		</div>
		<form method="post" action="login">
			<div class="row">
				<i class="fa-solid fa-envelope"></i> <input type="text"
					placeholder="Enter Email" name="email" id="email" required>
			</div>
			<div class="row">
				<i class="fas fa-lock"></i> <input type="password"
					placeholder="Enter Password" name="psw" id="psw" required>
			</div>
			<div class="row button">
				<input type="submit" value="Login">
			</div>

			<div class="Register">
				<a href="#" style="text-align: center;">Forgot Password?</a><br>
				<p style="margin-left: 50px;">Don't have an account?</p>
				<a href="registration.jsp"
					style="text-align: center; margin-top: -19px; margin-left: 160px;">
					Sign up</a>
			</div>
		</form>
	</div>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	<script type="text/javascript">
	var status = document.getElementById("status").value
	if (status == "failed") {
		swal("Sorry!","Wrong username or password","error");
	}
	</script>

</body>
</html>
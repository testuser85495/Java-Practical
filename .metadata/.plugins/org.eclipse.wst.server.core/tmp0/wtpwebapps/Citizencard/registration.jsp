<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register form</title>
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />


</head>
<style>
/*@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');*/
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

::selection {
	background: rgba(26, 188, 156, 0.3);
}

.container {
	max-width: 440px;
	padding: 0 20px;
	margin: 47px auto;
}

.wrapper {
	width: 100%;
	background: #fff;
	border-radius: 5px;
	box-shadow: 0px 4px 10px 1px rgba(0, 0, 0, 0.1);
}

.wrapper .title {
	height: 90px;
	background: #5356FF;
	border-radius: 5px 5px 0 0;
	color: #ffffff;
	font-size: 30px;
	display: flex;
	align-items: center;
	justify-content: center;
}

.wrapper form {
	padding: 30px 25px 25px 25px;
}

.wrapper form .row {
	height: 45px;
	margin-bottom: 15px;
	position: relative;
}

.wrapper form .row input {
	height: 100%;
	width: 100%;
	outline: none;
	padding-left: 60px;
	border-radius: 5px;
	border: 1px solid lightgrey;
	font-size: 16px;
	transition: all 0.3s ease;
}

 

form .row input::placeholder {
	color: #999;
}

.wrapper form .row i {
	position: absolute;
	width: 47px;
	height: 100%;
	color: #fff;
	font-size: 18px;
	background: #5356ff;
	border: 1px solid #16a085;
	border-radius: 5px 0 0 5px;
	display: flex;
	align-items: center;
	justify-content: center;
}

.wrapper form .pass {
	margin: -8px 0 20px 0;
}

.wrapper form .pass a {
	color: #16a085;
	font-size: 17px;
	text-decoration: none;
}

.wrapper form .pass a:hover {
	text-decoration: underline;
}

.wrapper form .button input {
	color: #ffffff;
	font-size: 20px;
	font-weight: 500;
	padding-left: 0px;
	background: #5356ff;
	border: 1px solid #282828;
	cursor: pointer;
}



.wrapper form .signup-link {
	text-align: center;
	margin-top: 20px;
	font-size: 17px;
}

.wrapper form .signup-link a {
	color: #5356ff;
	text-decoration: none;
}

form .signup-link a:hover {
	text-decoration: underline;
}
</style>

<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status") %>" />
	<div class="container">
		<div class="wrapper">
			<div class="title">
				<span>Registration Form</span>
			</div>
			<form method="post" action="Registation">
				<div class="row">
					<i class="fas fa-user"></i> <input type="text"
						placeholder="Enter name" name="name" id="name" required>
				</div>

				<div class="row">
					<i class="fa-solid fa-envelope"></i> <input type="text"
						placeholder="Enter Email" name="email" id="email" required>
				</div>

				<div class="row">
					<i class="fas fa-lock"></i> <input type="password"
						placeholder="Enter Password" name="psw" id="psw" required>
				</div>

				<div class="row">
					<i class="fa-solid fa-phone"></i> <input type=text
						placeholder="Enter mobile" name="mobile" id="mobile" required>
				</div>

				<div class="row button">
					<input type="submit" value="Register">
				</div>

				<div class="signup-link">
					Have an account? <a href="login.jsp"> log in</a>
				</div>
			</form>
		</div>
	</div>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	<script type="text/javascript">
	var status = document.getElementById("status").value
	if (status == "success") {
		swal("Congrats","Account Create Successfully","success");
	}
	
	</script>
	
</body>
</html>
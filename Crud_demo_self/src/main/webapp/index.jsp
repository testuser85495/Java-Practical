<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

.container {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 500px;
	width: 100%;
}

i {
	font-size: 25px;
	padding: 10px;
	/*         border:1px solid black;
 */ /*  */ /* color: purple; */
}

input {
	height: 25px;
}

.reg {
	border: 1px solid;
	border-radius: 4%;
	padding: 10px;
	/* background-color: #CD6155; */
}

.title {
	height: 25px;
	width: 100%;
	text-align: center;
	font-size: 25px;
	background-color: #cdc5b7;
}

.reg_btn {
	height: 25px;
	width: 100%;
	background-color: #cdc5b7;
}

.scriptlet {
	color: red;
	text-align: center;
}

a {
	text-decoration: none;
}

.login {
	height: 50px;
	width: 100%;
	border-radius: 14%;
	display: flex;
	align-items: center;
	align-it: center;
	justify-content: space-evenly;
}
</style>
<body>
	<div class="container">
		<div class="reg">
			<h3 class="scriptlet">
				<%
				String msg = (String) request.getAttribute("msg");
				if (msg != null) {
					out.print(msg);
				}
				%>
			</h3>
			<form action="userarea" method="post">
				<table>
					<tr>
						<td colspan="2" class="title">Register</td>
					</tr>
					<tr>
						<th><i class="fa-solid fa-user"></i></th>
						<td><input type="text" name="name" placeholder="Enter Name"
							required="required"></td>
					</tr>
					<tr>
						<td><i class="fa-solid fa-envelope"></i></td>
						<td><input type="email" name="email"
							placeholder="Enter Email" required="required"></td>
					</tr>
					<tr>
						<td><i class="fa-solid fa-lock"></i></td>
						<td><input type="password" name="password"
							required="required" placeholder="Enter Password" /></td>
					</tr>
					<tr class="reg_btn">
						<td colspan="2"><input type="submit" name="action"
							value="register" class="reg_btn"></td>
					</tr>
				</table>
				<table class="login">
					<tr>
						<td><h3>
								Have an account? <a href="login.jsp">Log in</a>
							</h3></td>
					</tr>
				</table>
			</form>
		</div>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" />
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

.login_btn {
	height: 25px;
	width: 100%;
	background-color: #cdc5b7;
}

.scriptlet {
	color: red;
	text-align: center;
}

.register {
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
				String msg1 = (String) request.getAttribute("msg1");
				if (msg1 != null) {
					out.print(msg1);
				}
				String reg = (String) request.getAttribute("reg");
				if (reg != null) {
					out.print(reg);
				}
				%>
			</h3>
			<form action="userarea" method="post">
				<table>
					<tr>
						<td colspan="2" class="title">Login</td>
					</tr>
					<!-- <tr>
						<th><i class="fa-solid fa-user"></i></th>
						<td><input type="text" name="name" placeholder="Enter Name"
							required="required"></td>
					</tr> -->
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
					<tr>
						<td colspan="2"><input type="submit" name="action"
							value="login" class="login_btn"></td>
					</tr>
				</table>
				<table class="register">
					<tr>
						<td>Don't have an account <a href="index.jsp">Register</a>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
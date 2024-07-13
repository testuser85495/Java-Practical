<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registation Form</title>
</head>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

.container {
	height: 520px;
	display: flex;
	justify-content: center;
	align-items: center;
	background-color: aquamarine;
}

td {
	justify-content: center;
}

.tbl_reg {
	height: 200px;
	border: 1px black solid;
	border-radius: 4%;
	padding: 20px;
	padding-top: 1px;
	padding-bottom: 10px;
}

.reg_submit {
	height: 25px;
	width: 100%;
}

a {
	text-decoration: none;
	color: blue;
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

#reg_submit {
	border-radius: 10px;
}

.scriptlet {
	color: red;
	text-align: center;
}
</style>
<body>
	<div class="container">
		<h3 class="scriptlet">
			<%
			String msg = (String) request.getAttribute("msg");
			if (msg != null) {
				out.print(msg);
			}
			%>
		</h3>

		<form action="UserController" method="post">
			<table cellspacing="15" class="tbl_reg">
				<tr>
					<td colspan="2">
						<h1>Registration Form</h1>
					</td>
				</tr>
				<tr>
					<td><label>Name : </label></td>
					<td><input type="text" name="name" placeholder="Enter Name"
						required="required"></td>
				</tr>

				<tr>
					<td><label>Email : </label></td>
					<td><input type="email" name="email" placeholder="Enter Email"
						required="required"></td>
				</tr>


				<tr>
					<td><label>Password : </label></td>
					<td><input type="password" name="password"
						placeholder="Enter Password" required="required"></td>
				</tr>

				<tr>
					<td><label>Address : </label></td>
					<td><input type="text" name="address"
						placeholder="Enter Address" required="required"></td>
				</tr>

				<tr>
					<td><label>Contact : </label></td>
					<td><input type="text" name="contact"
						placeholder="Enter Contact" required="required"></td>
				</tr>

				<tr>
					<td><label>Country : </label></td>
					<td><input type="text" name="country"
						placeholder="Enter Country" required="required"></td>
				</tr>

				<tr>
					<td><label>Gender : </label></td>
					<td><input type="text" name="gender"
						placeholder="Enter Gender" required="required"></td>
				</tr>

				<tr>
					<td colspan="2"><input type="Submit" name="action"
						value="Register" class="reg_submit" id="reg_submit" /></td>
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
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.error {
	color: red;
}
</style>
<body>
	<%
	String namemsg = (String) request.getAttribute("namemsg");
	%>
	<%
	String contactmsg = (String) request.getAttribute("contactmsg");
	%>
	<%
	String addressmsg = (String) request.getAttribute("addressmsg");
	%>
	<%
	String dobsmsg = (String) request.getAttribute("dobsmsg");
	%>
	<form action="RegisterController" method="post">

		<table>
			<tr>
				<td><label for="name">Name:</label></td>
				<td><input type="text" id="name" name="name"></td>
				<td class="error">
					<%
					if (namemsg != null) {
						out.print(namemsg);
					}
					%>
				</td>
			</tr>

			<tr>
				<td><label for="contact">Contact:</label></td>
				<td><input type="text" id="contact" name="contact"></td>
				<td class="error">
					<%
					if (contactmsg != null) {
						out.print(contactmsg);
					}
					%>
				</td>
			</tr>

			<tr>
				<td><label for="address">Address:</label></td>
				<!-- <td><input type="" id="address" name="address" maxlength="100" ></td> -->
				<td><textarea rows="4" cols="50" name="address"
						placeholder="enter your address"> </textarea></td>
				<td class="error">
					<%
					if (addressmsg != null) {
						out.print(addressmsg);
					}
					%>
				</td>
			</tr>

			<tr>
				<td><label for="gender">Gender:</label></td>
				<td><select id="gender" name="gender">
						<option value="male">Male</option>
						<option value="female">Female</option>
				</select></td>

			</tr>
			<tr>
				<td><label for="dob">Date of Birth:</label></td>
				<td><input type="date" id="dob" name="dob"></td>
				<td class="error">
					<%
					if (dobsmsg != null) {
						out.print(dobsmsg);
					}
					%>
				</td>
			</tr>
			<tr>
				<td><label>Email:</label></td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td><label>Password:</label></td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>

		</table>
	</form>
</body>
</html>
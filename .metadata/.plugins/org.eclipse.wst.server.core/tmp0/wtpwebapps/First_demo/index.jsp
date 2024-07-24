<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<title>Register</title>
</head>


<body>
	<div class="container">
		<form action="UserController" method="post">
			<table cellspacing="15" class="tbl_reg d-grid gap-2 col-6 mx-auto">
				<tr>
					<td colspan="2" class="text-center">
						<h1>Registration Form</h1>
					</td>
				</tr>
				<tr>
					<td><label>Name : </label></td>
					<td><input type="text" name="name" placeholder="Enter Name"
						class="form-control my-3" required="required"></td>
				</tr>

				<tr>
					<td><label>Address : </label></td>
					<td><input type="text" name="address"
						placeholder="Enter Address" required="required"
						class="form-control my-3"></td>
				</tr>


				<tr>
					<td><label>Email : </label></td>
					<td><input type="email" name="email" placeholder="Enter Email"
						required="required" class="form-control my-3"></td>
				</tr>
				<tr>
					<td><label>Password : </label></td>
					<td><input type="password" name="password"
						placeholder="Enter Password" required="required"
						class="form-control my-3"></td>
				</tr>

				<tr>
					<td><label>Country : </label></td>
					<td><select name="country" id="Country"
						class="form-select my-3">
							<option selected>Select Country</option>
							<option value="India">India</option>
							<option value="USA">USA</option>
							<option value="Canada">Canada</option>
							<option value="UK">UK</option>
					</select></td>
				</tr>

				<tr>
					<td><label>Gender : </label></td>
					<td><label class="form-check-inline my-3"> <input
							type="radio" name="gender" value="male" class="form-check-input">
							Male
					</label> <label class="form-check-inline"> <input type="radio"
							name="gender" value="female" class="form-check-input">
							Female
					</label></td>
				</tr>


				<tr>
					<td><label>Hobbies : </label></td>
					<td><label class="form-check-inline my-3"> <input
							type="checkbox" name="hobbie" value="playing"
							class="form-check-input"> Playing
					</label> <label class="form-check-inline my-3"> <input type="checkbox"
							name="hobbie" value="Dancing" class="form-check-input">
							Dancing
					</label> <label class="form-check-inline my-3"> <input type="checkbox"
							name="hobbie" value="Reading" class="form-check-input">
							Reading
					</label></td>
				</tr>
				<tr>
					<td colspan="2"><input type="Submit" name="action"
						value="Register" class="d-grid gap-2 col-6 mx-auto btn btn-primary reg_submit"
						id="reg_submit" /></td>
				</tr>
			</table>
			<!-- <h4><a href="home.jsp">List</a></h4> -->
		</form>
	</div>
</body>
</html>
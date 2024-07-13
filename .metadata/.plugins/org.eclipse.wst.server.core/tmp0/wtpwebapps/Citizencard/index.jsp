
 <%
if (session.getAttribute("name") == null) {
	response.sendRedirect("login.jsp");
}
%> 



<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Citizen System</title>
</head>
<style>
/*  @media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }  */
body {
	background-color: #378CE7;
}

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}
.logo{
display: flex;
}
.header {
height: 50px;
	overflow: hidden;
	background-color: #5356FF;
	width: 100%;
	position: fixed;
}

.header a {
	float: left;
	color: #ffffff;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
}

.header a:hover {
	background-color: #DFF5FF;
	color: black;
}

.header-right {
	float: right;
	display: flex;
	flex-direction: row-reverse;
}
</style>
<body>
	<div class="header">
		<a href="index.jsp" class="logo"><img alt="wayland"
			src="C:\Users\maruf\Downloads\wayland-logo.png"></a>
<form action="" method=""></form>
		<%
		      if (session.getAttribute("name") != null) {
		     %>
		        <div class="header-right">
			       <a href="#"><%=session.getAttribute("name")%></a> <a href="logout">Logout</a>
			       <a href="#contact">Contact</a> <a class="active" href="#home">Home</a>
		       </div>
		    <%
		    } else {
		    %>
		       <div class="header-right">
			      <a href="registration.jsp">Register</a> <a href="login.jsp">Login</a>
			      <a href="#contact">Contact</a> <a class="active" href="#home">Home</a>
		       </div>
		    <%
		    }
		%>
	</div>
</body>
</html>
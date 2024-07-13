<%@page import="doa.MantanceDOA"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="user-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User mantenance</title>
</head>
<body>
	<%
	String msg = (String) request.getAttribute("msg");
	%>
	
	<%
	Calendar cal = Calendar.getInstance();
	int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	%>
	<%-- <%
	Boolean flag = MantanceDOA.checkStatus(u.getId());
	%>
	<%
	if (days > 30 && flag == false) {
	%> --%>
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
		<div class="s-12 m-12 l-4 center">
			<h4 class="text-size-20 margin-bottom-20 text-dark text-center">
				mantenance Charge</h4>
			<form action="MantanceController" class="customform" method="post">
				<div class="s-12">
					<input type="hidden" name="uid" class="subject"
						value="<%=u.getId()%>"> <input name="email"
						class="subject" value="<%=u.getEmail()%>" readonly>
				</div>

				<div class="s-12">
					<%
					double amount = 500;
					%>
					<input name="mantenanceamount" class="subject" value="<%=amount%>"
						readonly>
				</div>


				<div class="s-12">
					<button name="action" value="Process Pay"
						class="s-12 submit-form button background-primary text-white"
						type="submit">Process To Pay</button>
				</div>
			</form>
		</div>
	</section>
	<%-- <% } else {%>
		<section class="section background-white">
		<div class="s-12 m-12 l-4 center">
			<h4 class="text-size-20 margin-bottom-20 text-dark text-center">
				mantenance Charge</h4>
			<form action="MantanceController" class="customform" method="post">
				<div class="s-12">
					<input type="hidden" name="uid" class="subject"
						value="<%=u.getId()%>"> <input name="email"
						class="subject" value="<%=u.getEmail()%>" readonly>
				</div>

				<div class="s-12">
					<%
					double amount = 0;
					%>
					<input name="mantenanceamount" class="subject" value="<%=amount%>"
						readonly>
				</div>

				<div class="s-12">
					<button name="action" value="Process Pay"
						class="s-12 submit-form button background-primary text-white"
						type="submit" disabled="disabled">Process To Pay</button>
				</div>
			</form>
		</div>
	</section>
	<% }%> --%>
<script type="text/javascript">
		window.setTimeout(function() {
			$(".alert").fadeTo(500, 0).slideUp(500, function() {
				$(this).remove();
			});
		}, 4000);
	</script>

</body>
</html>
<%@include file="footer.jsp"%>
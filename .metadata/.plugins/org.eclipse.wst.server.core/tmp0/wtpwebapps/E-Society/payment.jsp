<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="user-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
.bttnStyle {
	background-color: lightblue;
	border-radius: 0.50rem;
	border: 1px solid transperent;
}
</style>
<%String date = (String) request.getAttribute("date"); %>
<script type="text/javascript">
	var xhttp = new XMLHttpRequest();
	var RazorpayOrderId;
	function CreateOrderID() {
		/* alert("1"); */

		var number = document.getElementById("mantenanceamount").value;
		var uid = document.getElementById("uid").value;
		var date = document.getElementById("date").value;
		xhttp.open("GET",
				"http://localhost:8080/E-Society/OrderCreation?mantenanceamount="
						+ number + "&uid=" + uid +"&date=" +date, false);
		/* alert("2"); */
		xhttp.send();
		RazorpayOrderId = xhttp.responseText;

		alert(number);
		OpenCheckOut(number);
		/* alert("in OpenCheckOut number"); */
		OpenCheckOut();
		/* alert("OpenCheckOut"); */
	}
</script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
	function OpenCheckOut() {
		/* alert("3");  */
		var number = document.getElementById("mantenanceamount").value;
		/* alert(number); */
		var options = {
			"key" : "rzp_test_L8oMPzGm1Bj2cF",
			"mantenanceamount" : number,
			"currency" : "INR",
			"name" : "Sarthak",
			"description" : "Test",
			"order_id" : RazorpayOrderId,

			"callback_url" : "http://localhost:8080/E-Society/user-home.jsp",
			"prefill" : {
				"name" : "Sarthak Thakor",
				"email" : "thakorsarthak618@gmail.com",
				"contact" : "9408014329"
			},
			"notes" : {
				"address" : "Ahmedabad"
			},
			"theme" : {
				"color" : "#3399cc"
			}

		};
		var rzp1 = new Razorpay(options);
		rzp1.on('payment.failed', function(response) {
			alert(response.error.code);
			alert(response.error.description);
			alert(response.error.source);
			alert(response.error.step);
			alert(response.error.reason);
			alert(response.error.metadata.order_id);
			alert(response.error.metadata.payment_id);
		});
		rzp1.open();
		/* e.preventDefault(); */
	}
</script>
<body>
	<%-- <%
	String email = (String) request.getAttribute("email");
	double mantenanceamount = (Double) request.getAttribute("mantenanceamount");
	int uid1 = (Integer) request.getAttribute("uid");
	%> --%>
	<%
	Double am = Double.parseDouble(request.getParameter("mantenanceamount"));
	%>
	<%
	int uid = Integer.parseInt(request.getParameter("uid"));
	%>
<div id="order_id">
	
</div>
	<!-- <form action="MantanceController" class="customform" method="post"> -->
	<section class="section background-white">
		<div class="s-12 m-12 l-4 center">
			<h4 class="text-size-20 margin-bottom-20 text-dark text-center">
				Pay mantenance</h4>
			<form class="customform">
				<div class="s-12">
				<input type="text" id="date" class="subject" value="<%=date%>" readonly>
					<input type="hidden" id="uid" class="subject" value="<%=uid%>">
					
					<%-- <input name="email" class="subject" value="<%=email%>" readonly> --%>
				</div>

				<div class="s-12">
				<%out.print(uid); %>
					<input  class="subject" id="mantenanceamount" value="<%=am%>"
						readonly>
				</div>
			</form>

			<div class="s-12">
				<button
					class="s-12 submit-form button background-primary text-white"
					id="payButton" onclick="CreateOrderID()" class="bttnStyle">Pay
					Now</button>
			</div>

		</div>
	</section>

	<!-- </form>
 -->
</body>
</html>
<%@include file="footer.jsp"%>
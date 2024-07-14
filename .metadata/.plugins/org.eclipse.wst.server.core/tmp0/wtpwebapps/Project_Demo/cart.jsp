<%@page import="doa.ProductDAO"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart</title>
</head>
<body>
	<!-- Start Hero Section -->
	<div class="hero">
		<div class="container">
			<div class="row justify-content-between">
				<div class="col-lg-5">
					<div class="intro-excerpt">
						<h1>Cart</h1>
					</div>
				</div>
				<div class="col-lg-7"></div>
			</div>
		</div>
	</div>
	<!-- End Hero Section -->



	<div class="untree_co-section before-footer-section">
		<div class="container">
			<div class="row mb-5">
				<!-- <form class="col-md-12" method="post"> -->
				<div class="site-blocks-table">
					<table class="table">
						<thead>
							<tr>
								<th class="product-thumbnail">Image</th>
								<th class="product-name">Product</th>
								<th class="product-price">Price</th>
								<th class="product-quantity">Quantity</th>
								<th class="product-total">Total</th>
								<th class="product-remove">Remove</th>
							</tr>
						</thead>
						<%
						List<cart> cartlist = Cartdoa.getCartBycustId(c.getId());
						%>
						<%
						int subtotal = 0;
						%>
						<%
						for (cart c1 : cartlist) {
						%>
						<%
						subtotal = subtotal + c1.getTotal_price();
						%>
						<%
						Product p = ProductDAO.GetProductById(c1.getPid());
						%>
						<tbody>
							<tr>
								<td class="product-thumbnail"><img
									src="image/<%=c1.getPimage()%>" alt="Image" class="img-fluid"
									height="200px" width="200px"></td>
								<td class="product-name">
									<h2 class="h5 text-black"><%=c1.getPname()%></h2>
								</td>
								<td><%=c1.getPprice()%></td>
								<td>

									<div
										class="input-group mb-3 d-flex align-items-center quantity-container"
										style="max-width: 120px;">
										<!-- <div class="input-group-prepend">
												<button class="btn btn-outline-black decrease" type="button">&minus;</button>
											</div> -->
										<form action="CartController" method="post">
											<input type="hidden" name="cart_id" value="<%=c1.getId()%>">
											<input type="number" name="qty" min=1
												class="form-control text-center quantity-amount"
												value="<%=c1.getQty()%>" placeholder=""
												aria-label="Example text with button addon"
												aria-describedby="button-addon1"
												onchange="this.form.submit();">
										</form>
									</div>

								</td>
								<td><%=c1.getTotal_price()%></td>
								<td><a
									href="remove_product_from_cart.jsp?id=<%=c1.getId()%>"
									class="btn btn-black btn-sm"><i class="fa-solid fa-trash" style="color: #f40b23;"></i></a></td>
							</tr>
						</tbody>
						<%
						}
						%>

					</table>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6">
					<div class="row mb-5">
						<div>
							<a href="shop.jsp" class="btn btn-outline-black btn-sm btn-block">Continue
								Shopping</a>
						</div>
					</div>
				</div>
				
				
				<div class="col-md-6 pl-5">
					<div class="row justify-content-end">
						<div class="col-md-7">
							<div class="row">
								<div class="col-md-12 text-right border-bottom mb-5">
									<h3 class="text-black h4 text-uppercase">Cart Totals</h3>
								</div>
							</div>
							<div class="row mb-3">
								<div class="col-md-6">
									<span class="text-black">Total Price</span>
								</div>
								<div class="col-md-6 text-right">
									<strong class="text-black"><%=subtotal%></strong>
								</div>
								<%cart c1= Cartdoa.getSingleCartByCusId(c.getId());%>
								<%if(c1 != null) {%>
								
								<form method="post" action="payment.jsp?amount=<%=subtotal%>&cid=<%=c1.getId()%>">
								
								<input class=" my-4 btn btn-outline-black btn-sm btn-block" value="CheckOut" type="submit" onclick="">
							</form>
							<%} %>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
<%@include file="footer.jsp"%>
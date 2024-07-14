<%@page import="doa.ProductDAO"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wishlist</title>
</head>
<body>
	<!-- Start Hero Section -->
	<div class="hero">
		<div class="container">
			<div class="row justify-content-between">
				<div class="col-lg-5">
					<div class="intro-excerpt">
						<h1>WishList</h1>
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
				<form class="col-md-12" method="post">
					<div class="site-blocks-table">
						<table class="table">
							<thead>
								<tr>
									<th class="product-thumbnail">Image</th>
									<th class="product-name">Product Name</th>
									<th class="product-price">Price</th>
									<!-- <th class="product-quantity">Quantity</th>
                          <th class="product-total">Total</th> -->
									<th class="product-Action">Action</th>
								</tr>
							</thead>
							<%
							List<WishList> list = WishLIstDAO.getWishListByCusId(c.getId());
							%>
							<%
							for (WishList w : list) {
							%>
							<tbody>
								<tr>
									<td class="product-thumbnail"><img
										src="image/<%=w.getImage()%>" alt="Image" class="img-fluid"
										height="200px" width="200px"></td>
									<td class="product-name">
										<h2 class="h5 text-black"><%=w.getPname()%></h2>
									</td>
									<td><%=w.getPprice()%></td>
									<td><a href="Delete-Wishilst.jsp?id=<%=w.getWid()%>"
										class="btn btn-black btn-sm"><i class="fa-solid fa-trash" style="color: #f40b23;"></i></a>
										<a class="btn btn-black btn-sm"
										href="CartController?action=addtocart&cid=<%=c.getId()%>&pid=<%=w.getPid()%>"><i
											class="fa-solid fa-cart-shopping"></i></a>
										</td>

								</tr>

							</tbody>
							<%
							}
							%>
						</table>
					</div>
				</form>
			</div>

			<!-- <div class="row">
				<div class="col-md-6">
					<div class="row mb-5">
						<div class="col-md-6 mb-3 mb-md-0">

							<a href="#" class="btn btn-black btn-sm btn-block">Update
								Cart</a>
						</div>
						<div class="col-md-6">
							<a href="shop.jsp" class="btn btn-outline-black btn-sm btn-block">Continue
								Shopping</a>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<label class="text-black h4" for="coupon">Coupon</label>
							<p>Enter your coupon code if you have one.</p>
						</div>
						<div class="col-md-8 mb-3 mb-md-0">
							<input type="text" class="form-control py-3" id="coupon"
								placeholder="Coupon Code">
						</div>
						<div class="col-md-4">
							<button class="btn btn-black">Apply Coupon</button>
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
									<span class="text-black">Subtotal</span>
								</div>
								<div class="col-md-6 text-right">
									<strong class="text-black">$230.00</strong>
								</div>
							</div>
							<div class="row mb-5">
								<div class="col-md-6">
									<span class="text-black">Total</span>
								</div>
								<div class="col-md-6 text-right">
									<strong class="text-black">$230.00</strong>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<button class="btn btn-black btn-lg py-3 btn-block"
										onclick="window.location='checkout.html'">Proceed To
										Checkout</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div> -->
		</div>
	</div>
</body>
</html>
<%@include file="footer.jsp"%>

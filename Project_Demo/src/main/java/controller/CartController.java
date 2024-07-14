package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import doa.Cartdoa;
import doa.ProductDAO;
import doa.WishLIstDAO;
import model.Product;
import model.cart;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("addtocart")) {
			
			int pid = Integer.parseInt(request.getParameter("pid"));
			int cid = Integer.parseInt(request.getParameter("cid"));
			Product p = ProductDAO.GetProductById(pid);
			cart crt = new cart();
			crt.setPid(Integer.parseInt(request.getParameter("pid")));
			crt.setCid(Integer.parseInt(request.getParameter("cid")));
			crt.setQty(1);
			crt.setPprice(p.getPprice());
			crt.setPimage(p.getPimage());
			crt.setPname(p.getPname());
			crt.setTotal_price(p.getPprice());
			crt.setPayment("pending");
			System.out.println("cart data "+crt);
			Cartdoa.insertcart(crt);
//			System.out.println("aftre insert");
//			WishLIstDAO.deleteWishlist(pid);
//			System.out.println("wishlist delete");
			response.sendRedirect("shop.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cart_id = Integer.parseInt(request.getParameter("cart_id"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		System.out.println(cart_id);
		System.out.println(qty);
		cart c = Cartdoa.getCartByCartId(cart_id);
		c.setId(cart_id);
		c.setQty(qty);
		c.setTotal_price(qty*c.getPprice());
		int subtotal = qty*c.getPprice();
		System.out.println(subtotal);
		c.setSubtotal(subtotal);
		Cartdoa.updateCart(c);
		response.sendRedirect("cart.jsp");
		
	}

}

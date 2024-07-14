package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import doa.Customerdoa;
import model.Customer;
import serviceOTP.Servicess;

/**
 * Servlet implementation class Customercontroller
 */
@WebServlet("/Customercontroller")
public class Customercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Customer c = new Customer();
			c.setName(request.getParameter("name"));
			c.setEmail(request.getParameter("email"));
			c.setAddress(request.getParameter("address"));
			c.setContact(Long.parseLong(request.getParameter("contact")));
			c.setPassword(request.getParameter("password"));
			
			String email = request.getParameter("email");
			Boolean check = Customerdoa.emailcheck(email);
			if (check == false) {
				Customerdoa.register(c);
				response.sendRedirect("login.jsp");
			}
			else {
				request.setAttribute("email", "account already registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
		}
		else if (action.equalsIgnoreCase("login")) {
			Customer c = new Customer();
			c.setEmail(request.getParameter("email"));
			c.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			Boolean check = Customerdoa.emailcheck(email);
			if (check==true) {
				Customer c1 = Customerdoa.login(c);
				if (c1 != null) {
					HttpSession session = request.getSession();
					session.setAttribute("data",c1);
					request.getRequestDispatcher("shop.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg1", "password is incorerect");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "account not registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		else if (action.equalsIgnoreCase("update")) {
			Customer c = new Customer();
			c.setId(Integer.parseInt(request.getParameter("id")));
			c.setName(request.getParameter("name"));
			c.setEmail(request.getParameter("email"));
			c.setAddress(request.getParameter("address"));
			c.setContact(Long.parseLong(request.getParameter("contact")));
			/* c.setPassword(request.getParameter("password")); */
			System.out.println(c);
			Customerdoa.update(c);
			HttpSession session  = request.getSession();
			session.setAttribute("data", c);
			request.getRequestDispatcher("shop.jsp").forward(request, response);
			
		}
		else if (action.equalsIgnoreCase("cp")) {
			int id =Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cp = request.getParameter("cp");
			System.out.println(op+np+cp);
			boolean flag = Customerdoa.opcheck(id, op);
			if (flag == true) {
				if (np.equals(cp)) {
					Customerdoa.updatepassword(id, np);
					response.sendRedirect("shop.jsp");
				}
				else {
					request.setAttribute("msg1", "New & Confirm password dosen't match");
					request.getRequestDispatcher("changepassword.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "old password wrong");
				request.getRequestDispatcher("changepassword.jsp").forward(request, response);
			}
			
 			
		}
		else if (action.equalsIgnoreCase("Get OTP")) {
			String email = request.getParameter("email");
			System.out.println(email);
			Boolean flag = Customerdoa.emailcheck(email);
			if (flag == true) {
				Random r = new Random();
				int num = r.nextInt(999999);
				Servicess.Sendmail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				request.getRequestDispatcher("verify-otp.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "account not registered");
				request.getRequestDispatcher("forgetpassword.jsp").forward(request, response);
			}
		}
		else if (action.equalsIgnoreCase("verify")) {
			String email = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			System.out.println(email+"system : "+otp1+"user : "+otp2);
			if (otp1==otp2) {
				request.setAttribute("email", email);
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg", "wrong OTP");
				request.getRequestDispatcher("verify-otp.jsp").forward(request, response);
			}
			
		}
		else if (action.equalsIgnoreCase("change-forgot-pass")) {
			String email= request.getParameter("email");
			String np= request.getParameter("np");
			String cp= request.getParameter("cp");
			System.out.println(email+"  "+np+"  "+cp);
			if (np.equals(cp)) {
				Customerdoa.changepassword(email, np);
				response.sendRedirect("login.jsp");
			}
			else {
				request.setAttribute("msg", "Password and confirm password not Match");
				request.setAttribute("email", email);
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
		}
	}

}

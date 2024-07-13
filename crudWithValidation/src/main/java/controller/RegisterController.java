package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import doa.UserDOA;
import model.User;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		LocalDate dob = (LocalDate.parse(request.getParameter("dob")));
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		
		if (!isValidName(name) || !isValidContact(contact) || !isValidAddress(address) || isValidDOB(dob) < 15) {
			if (!isValidName(name)) {
				request.setAttribute("namemsg", "Please enter only Alphabet");
			}
			if (!isValidContact(contact)) {
				request.setAttribute("contactmsg", "Please enter only Numeric 10 digits only");
			}
			if (!isValidAddress(address)) {
				request.setAttribute("addressmsg", "Address should not be more than 100 char");
			}
			if (isValidDOB(dob) < 15) {
				request.setAttribute("dobsmsg", "your age is less than 15");
			}
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else {
			System.out.println(name+contact+address+gender+dob+email+password);
			User u = new User();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setGender(request.getParameter("gender"));
			u.setDate (request.getParameter("dob"));
 			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			UserDOA.register(u);
			response.sendRedirect("login.jsp");
		}
		

	}

	
	private boolean isValidName(String name) {
		// Validate alphabetic characters only
		return name.matches("[a-zA-Z]+");
	}

	private boolean isValidContact(String contact) {
		return contact.matches("\\d{10}");
	}

	private boolean isValidAddress(String address) {
		return address.length() <= 100;
	}

	private int isValidDOB(LocalDate dob) {
		LocalDate currentDate = LocalDate.now();

        if (dob != null && currentDate != null) {
            return Period.between(dob, currentDate).getYears();
        } else {
            return 0; 
        }
	}
}

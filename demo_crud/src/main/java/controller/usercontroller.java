package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import doa.userdoa;
import model.user;

/**
 * Servlet implementation class usercontroller
 */
@WebServlet("/usercontroller")
public class usercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public usercontroller() {
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
		doGet(request, response);
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			user u = new user();
			u.setName(request.getParameter("name"));
			u.setEmail(request.getParameter("email"));
			u.setAddress(request.getParameter("address"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			String email = request.getParameter("email");
			Boolean flag = userdoa.emailcheck(email);
			if (flag == false) {
				userdoa.insertuser(u);
				response.sendRedirect("login.jsp");
			} else {
				request.setAttribute("msg1", "Email All Ready Exist");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}

		} else if (action.equalsIgnoreCase("login")) {
			user u = new user();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			Boolean flag = userdoa.emailcheck(email);
			if (flag == true) {
				user u1 = userdoa.loginuser(u);
				if (u1 == null) {
					request.setAttribute("msg", "password is incorrect");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", u1);
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg1", "email not exist");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
	}

}

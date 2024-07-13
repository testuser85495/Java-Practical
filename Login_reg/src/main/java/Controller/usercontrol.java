package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Doa.Userdoa;
import Model.user;

/**
 * Servlet implementation class usercontrol
 */
@WebServlet("/usercontrol")
public class usercontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public usercontrol() {
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
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			user usr = new user();
			usr.setName(request.getParameter("name"));
			usr.setEmail(request.getParameter("email"));
			usr.setPassword(request.getParameter("password"));
			usr.setGender(request.getParameter("gender"));
			usr.setDob(request.getParameter("dob"));
			Userdoa.register(usr);
			response.sendRedirect("login.jsp");
		}
		else if (action.equalsIgnoreCase("login")) {
			user u = new user();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			Boolean flag = Userdoa.emailcheck(email);
			if (flag == true) {
				user u1= Userdoa.login(u);
				if (u1 != null ) {
					HttpSession session=request.getSession();
					session.setAttribute("data",u1);
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "password is incorrect");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg1", "email not register");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
	}

}

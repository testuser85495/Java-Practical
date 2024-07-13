package controller;

import java.awt.Checkbox;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.ast.AND_AND_Expression;

import com.mysql.cj.Session;

import doa.AdminDOA;
import model.Admin;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminController() {
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
			Admin admin = new Admin();
			admin.setName(request.getParameter("name"));
			admin.setEmail(request.getParameter("email"));
			admin.setContact(Long.parseLong(request.getParameter("contact")));
			admin.setAddress(request.getParameter("address"));
			admin.setPassword(request.getParameter("password"));
			System.out.println(admin);
//			Check email
			String email = request.getParameter("email"); 
			Boolean emailflag = AdminDOA.emailcheck(email);
			if (emailflag == true) {
				request.setAttribute("msg", "E-mail Is Allready Registered!");
				request.getRequestDispatcher("admin-register.jsp").forward(request, response);
			}
			else {
				AdminDOA.adminRegister(admin);
				request.setAttribute("msg", "You have been signed in successfully!");
				request.getRequestDispatcher("admin-login.jsp").forward(request, response);
			}
			
		}
		if (action.equalsIgnoreCase("login")) {
			Admin admin = new Admin();
			admin.setEmail(request.getParameter("email"));
			admin.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			Boolean emailflag = AdminDOA.emailcheck(email);
			if (emailflag == true) {
				System.out.println("email true");
				Admin admin2=AdminDOA.adminLogin(admin);
				if (admin2 != null) {
					System.out.println("password check true");
					HttpSession session = request.getSession();
					session.setAttribute("data", admin2);
					request.getRequestDispatcher("admin-home.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg2", "Wrong Password! ");
					request.getRequestDispatcher("admin-login.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg1", "Wrong E-mail! ");
				request.getRequestDispatcher("admin-login.jsp").forward(request, response);
			}
			
		}
	}

}

package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JSpinner.DateEditor;

import org.eclipse.jdt.internal.compiler.ast.AND_AND_Expression;

import com.mysql.cj.Session;

import doa.AdminDOA;
import doa.UserDOA;
import model.Complain;
import model.User;
import servicess.serviceEmail;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("changestatus")) {
			String email = request.getParameter("emailid");
			User user = new User();
			user.setEmail(request.getParameter("emailid"));
			serviceEmail s = new serviceEmail();
			s.sendMailConfirmStatus(email, user);
			UserDOA.changeStatus(email);
			response.sendRedirect("admin-home.jsp");
		}
		if (action.equalsIgnoreCase("Rejectstatus")) {
			String email = request.getParameter("emailid");
			User user = new User();
			user.setEmail(request.getParameter("emailid"));
			serviceEmail s = new serviceEmail();
			s.sendMailRejectStatus(email, user);
			UserDOA.rejectStatus(email);
			response.sendRedirect("admin-home.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			User user = new User();
			user.setFname(request.getParameter("fname"));
			user.setLname(request.getParameter("lname"));
			user.setEmail(request.getParameter("email"));
			user.setContact(Long.parseLong(request.getParameter("contact")));
			user.setPassword(request.getParameter("password"));
			user.setAddress(request.getParameter("address"));
			user.setStatus("pending");
			System.out.println(user);
			String password = request.getParameter("password");
			String cpassword = request.getParameter("cpassword");
			String email = request.getParameter("email");
			Boolean emailflag = UserDOA.checkemail(email);
			Boolean confirmflag = UserDOA.checkemailstatus(email);
			boolean rejectflag = UserDOA.checkemailrejectstatus(email);
			if (emailflag == true || confirmflag == true || rejectflag == true) {
				if (emailflag) {
					System.out.println("emailflag part");
					request.setAttribute("msg", "E-mail Is Allready Registered!");
					request.getRequestDispatcher("user-register.jsp").forward(request, response);
					
				} else if (confirmflag) {
					System.out.println("Confirmflag");
					if (password.equals(cpassword)) {
						request.setAttribute("msg", "Your E-mail Is Allready Registered! wait for confirmation");
						request.getRequestDispatcher("waiting.jsp").forward(request, response);
					} else {
						request.setAttribute("msg1", "password & conform Password Not Match");
						request.getRequestDispatcher("user-register.jsp").forward(request, response);
					}
				}
				else if (rejectflag) {
					System.out.println("rejectflag");
					request.setAttribute("msg1", "Sorry! we Don't allow you rejected");
					request.getRequestDispatcher("user-register.jsp").forward(request, response);
				}

			} else {
				System.out.println("emailflag else part");
				if (password.equals(cpassword)) {
					UserDOA.userRegister(user);
					request.setAttribute("msg3", "You have been signed in successfully!");
					request.getRequestDispatcher("user-login.jsp").forward(request, response);
				} else {
					request.setAttribute("msg1", "password & conform Password Not Match");
					request.getRequestDispatcher("user-register.jsp").forward(request, response);
				}
			}
		}
		if (action.equalsIgnoreCase("login")) {
			User user = new User();
			user.setEmail(request.getParameter("email"));
			user.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = UserDOA.checkemail(email);
			boolean statusflag = UserDOA.checkemailstatus(email);
			boolean rejectflag = UserDOA.checkemailrejectstatus(email);
			if (flag == true || statusflag == true || rejectflag == true) {
				if (flag) {
					User u1 = UserDOA.userLogin(user);
					if (u1 != null) {
						HttpSession session = request.getSession();
						session.setAttribute("data", u1);
						request.getRequestDispatcher("user-home.jsp").forward(request, response);
					} else {
						request.setAttribute("msg1", "Wrong Password! ");
						request.getRequestDispatcher("user-login.jsp").forward(request, response);
					}
				} else if (statusflag) {
					User u1 = UserDOA.userLogin(user);
					if (u1 != null) {
						response.sendRedirect("waiting.jsp");
					} else {
						request.setAttribute("msg1", "Wrong Password! ");
						request.getRequestDispatcher("user-login.jsp").forward(request, response);
					}
				}

				else if (rejectflag) {
					request.setAttribute("msg1", "Sorry! we Don't allow you rejected");
					request.getRequestDispatcher("user-login.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg", "Wrong E-mail! ");
				request.getRequestDispatcher("user-login.jsp").forward(request, response);
			}

		}
		if (action.equalsIgnoreCase("change password")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String oldpassword = request.getParameter("oldpassword");
			String newpassword = request.getParameter("newpassword");
			String cpassword = request.getParameter("cpassword");
			System.out.println(oldpassword + newpassword + cpassword + id);
			boolean flag = UserDOA.checkpassword(oldpassword, id);
			if (flag == true) {
				if (newpassword.equals(cpassword)) {
					UserDOA.changepassword(newpassword, id);
					response.sendRedirect("user-home.jsp");
				} else {
					request.setAttribute("msg1", "New & Confirm Password Not Match ");
					request.getRequestDispatcher("user-changepassword.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg", "Wrong Old Password! ");
				request.getRequestDispatcher("user-changepassword.jsp").forward(request, response);
			}
		}
		
	}

}

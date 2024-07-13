package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.userdao;
import model.user;

/**
 * Servlet implementation class userarea
 */
@WebServlet("/userarea")
public class userarea extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public userarea() {
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
			user User = new user();
			User.setName(request.getParameter("name"));
			User.setEmail(request.getParameter("email"));
			User.setPassword(request.getParameter("password"));
			System.out.println(User);

			String email = request.getParameter("email");
			Boolean flag = userdao.emailcheck(email);
			if (flag == false) {
				userdao.Insert(User);
				request.setAttribute("reg", "Registation Done");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "email allready exist");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}

		} else if (action.equalsIgnoreCase("login")) {
			user U = new user();
			U.setEmail(request.getParameter("email"));
			U.setPassword(request.getParameter("password"));
			System.out.println("email : " + U.getEmail() + "password : " + U.getPassword());
			String email = request.getParameter("email");
			boolean flag = userdao.emailcheck(email);
			if (flag == true) {
				user u1 = userdao.login(U);
				if (u1 == null) {
					request.setAttribute("msg1", "password incorrect");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else {
					HttpSession session = request.getSession();
					session.setAttribute("data", u1);
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "account not registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		else if (action.equalsIgnoreCase("edit")) {
			int id= Integer.parseInt(request.getParameter("id"));
			user u = userdao.getUserById(id);
			request.setAttribute("data", u);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update")) {
			user u = new user();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
//			System.out.println("upadte process for doa");
			userdao.updateuser(u);
			response.sendRedirect("home.jsp");
		}
		else if(action.equalsIgnoreCase("delete")) {
			int id= Integer.parseInt(request.getParameter("id"));
			userdao.deleteUser(id);
			response.sendRedirect("home.jsp");
		}
	}

}

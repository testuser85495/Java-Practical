package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.user;
import dao.Userdao;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String action = request.getParameter("action");
//		System.out.println("action");
		if (action.equalsIgnoreCase("register")) {
			user u = new user();
			u.setName(request.getParameter("name"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			u.setAddress(request.getParameter("address"));
			u.setCountry(request.getParameter("country"));
			u.setGender(request.getParameter("gender"));
			String[] hobbiesArray = request.getParameterValues("hobbie");
			u.setHobbies(hobbiesArray);
			System.out.println(u);
			Userdao.insertUser(u);
			response.sendRedirect("home.jsp");
			
		} 
		else if (action.equalsIgnoreCase("update")) {
			System.out.println("inside Edit");
			user u= new user();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			u.setAddress(request.getParameter("address"));
			u.setCountry(request.getParameter("country"));
			u.setGender(request.getParameter("gender"));
			String[] hobbiesArray = request.getParameterValues("hobbie");
			u.setHobbies(hobbiesArray);
			System.out.println(u);
			Userdao.updateUserById(u);
			response.sendRedirect("home.jsp");
			
		}

	}

}

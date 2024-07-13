package com.reg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registation")
public class Registation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upass = request.getParameter("psw");
		String umobile = request.getParameter("mobile");
		RequestDispatcher dispatcher = null;
		Connection connection = null;
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs?seSSl=false","root","");
			PreparedStatement pst = connection.prepareStatement("insert into csuser (name,email,pass,mobile) values(?,?,?,?) ");
			pst.setString(1, uname);
			pst.setString(2, uemail);
			pst.setString(3, upass);
			pst.setString(4, umobile);
			int rowcount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("registration.jsp");
			if (rowcount  > 0) {
				request.setAttribute("status", "success");
			}
			else {
				request.setAttribute("status", "failed");
			}
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.getStackTrace();
		}
		finally {
			try {
//				if (connection != null) 
//				{ connection.close(); }
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		
	}

}

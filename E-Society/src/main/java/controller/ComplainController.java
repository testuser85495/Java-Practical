package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import doa.ComplainDOA;
import doa.UserDOA;
import model.Complain;
import servicess.serviceEmail;


/**
 * Servlet implementation class ComplainController
 */
@WebServlet("/ComplainController")
public class ComplainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("complainconfirm")) {
			String email= request.getParameter("emailid");
			System.out.println(email);
			Complain c = new Complain();
			c.setEmail(request.getParameter("emailid"));
			Date current_Date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
			formatter = new SimpleDateFormat("dd MMMM yyyy");  
			String strDate = formatter.format(current_Date);    
			c.setCompletedate(strDate);
			serviceEmail s = new serviceEmail();
			s.sendMailComplainconfirm(email, c);
			ComplainDOA.confirmStatus(email, c);
			response.sendRedirect("admin-home.jsp");
		}
		if (action.equalsIgnoreCase("complainreject")) {
			String email= request.getParameter("emailid");
			System.out.println(email);
			Complain c = new Complain();
			c.setEmail(request.getParameter("emailid"));
			Date current_Date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
			formatter = new SimpleDateFormat("dd MMMM yyyy");  
			String strDate = formatter.format(current_Date);    
			c.setCompletedate(strDate);
			serviceEmail s = new serviceEmail();
			s.sendMailComplainReject(email, c);
			ComplainDOA.rejectStatus(email, c);
			response.sendRedirect("admin-home.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("Complain")) {
			String email = request.getParameter("email");
			Boolean flag = UserDOA.checkemail(email);
			if (flag == true) {
				Complain c = new Complain();
				c.setUid(Integer.parseInt(request.getParameter("uid")));
				c.setName(request.getParameter("name"));
				c.setEmail(request.getParameter("email"));
				c.setComplain(request.getParameter("comlpain"));
				Date current_Date = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
				formatter = new SimpleDateFormat("dd MMMM yyyy");  
				String strDate = formatter.format(current_Date);    
//				c.getDate1();
				c.setDate(strDate);
				c.setC_status("pending");
//				c.setCompletedate("null");
				System.out.println(c);
				ComplainDOA.insetComplain(c);
				response.sendRedirect("user-home.jsp");
			}
			else {
				request.setAttribute("msg", "You have not registered with this email");
				request.getRequestDispatcher("user-complain.jsp").forward(request, response);
			}
		}
	}

}

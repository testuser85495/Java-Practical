package controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import doa.MantanceDOA;
import doa.UserDOA;
import model.Mantance;
import model.User;

/**
 * Servlet implementation class MantanceController
 */
@WebServlet("/MantanceController")
public class MantanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MantanceController() {
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
		/*
		 * String action = request.getParameter("action"); if
		 * (action.equalsIgnoreCase("pay")) { DateFormat dateFormat =
		 * DateFormat.getDateInstance(DateFormat.DEFAULT); String date =
		 * dateFormat.format(new Date()); DateFormat dateFormatt =
		 * DateFormat.getDateInstance(DateFormat.DATE_FIELD); String sdate =
		 * dateFormatt.format(new Date());
		 * 
		 * Calendar cal = Calendar.getInstance(); cal.add(Calendar.MONTH, -1); Date
		 * result = cal.getTime();
		 * 
		 * System.out.println(result); System.out.print(date); System.out.print(sdate);
		 * 
		 * }
		 */

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("Process Pay")) {
			String email = request.getParameter("email");
			Double mantenanceamount = Double.parseDouble(request.getParameter("mantenanceamount"));
			int uid = Integer.parseInt(request.getParameter("uid"));
			System.out.println(email + " " + mantenanceamount + " " + uid);
			Boolean flag = MantanceDOA.checkUidExist(uid);
			if (flag == false) {
				Mantance m = new Mantance();
				m.setUid(Integer.parseInt(request.getParameter("uid")));
				m.setAmount(Double.parseDouble(request.getParameter("mantenanceamount")));
				m.setStatus("unpaid");
				DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
				String date = dateFormat.format(new Date());
				m.setDate(date);
				System.out.println(m);
//				MantanceDOA.insertMantance(m);
				request.setAttribute("date", date);
				request.getRequestDispatcher("payment.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "All Ready Paid For This Month");
				request.getRequestDispatcher("user-mantenance.jsp").forward(request, response);
			}
		}
	}
}

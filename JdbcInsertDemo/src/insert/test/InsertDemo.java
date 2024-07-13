package insert.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("Enter your name: "); String name = scanner.nextLine();
		 * System.out.print("Enter your gender: "); String gender = scanner.nextLine();
		 * System.out.print("Enter your rollno: "); int rollno = scanner.nextInt();
		 */
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abx", "root", "");
		PreparedStatement ps = connection.prepareStatement("select * from std");
//		PreparedStatement ps = connection.prepareStatement("insert into std values('"+name+"','"+rollno+"','"+gender+"')");
//		PreparedStatement ps = connection.prepareStatement("insert into std values(?,?,?)");
//		PreparedStatement ps = connection.prepareStatement("update std set gender=? where name=?");
//		ps.setString(2, gender);
//		ps.setString(1, name);
//		ps.setString(1, name);
//		ps.setString(2, gender);
//		ps.setInt(3, rollno);
//		int i = ps.executeUpdate();
//		if (i > 0) {
//			System.out.println("Data Insert success!!");
//		}
//		else {
//			System.out.println("fail");
//		}
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			String name1 = rs.getString("name");
			System.out.println("name:  "+name1);
			int no=rs.getInt("rollno");
			System.out.println("rollno : "+no);
			String gender1=rs.getString("gender");
			System.out.println("gender: "+ gender1);
			
		}
		connection.close();
		
		
	}

}

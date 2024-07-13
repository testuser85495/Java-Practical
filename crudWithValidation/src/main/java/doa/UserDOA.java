package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.User;

public class UserDOA {
	public static void register(User u) {
		try {
			System.out.println("inside register");
			Connection conn= DBConnection.DriverConnection();
			String sql = "insert into user(name,contact,address,gender,dob,email,password)values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getGender());
			pst.setString(5, u.getDate());
			pst.setString(6, u.getEmail());
			pst.setString(7, u.getPassword());
			pst.executeUpdate();
			System.out.println("register Done");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}

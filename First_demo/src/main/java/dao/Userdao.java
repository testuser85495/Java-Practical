package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.user;
import connection.DBconnection;

public class Userdao {


	public static void insertUser(user u) {
		try {
			Connection conn = DBconnection.driverconnection();
			String sql="insert into csuser(name,email,pass,address,contact,country,gender) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,u.getName());
			pst.setString(2, u.getEmail());
			pst.setString(3, u.getPassword());
			pst.setString(4, u.getAddress());
			pst.setLong(5, u.getContact());
			pst.setString(6, u.getCountry());
			pst.setString(7, u.getGender());
			
//			pst.setString(4, u.getEmail());
//			pst.setString(5, u.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean emailcheck(String email) {
		boolean check = false;
		try {
			Connection conn = DBconnection.driverconnection();
			String sql ="select email from user where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				check = true;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return check ;
		
	}
}

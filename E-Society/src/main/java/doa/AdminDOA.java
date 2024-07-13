package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sound.midi.Patch;

import connection.DBConnection;
import model.Admin;

public class AdminDOA {
	public static boolean emailcheck(String email) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "select * from admin where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return flag;
	}
	
	public static void adminRegister(Admin admin) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "insert into admin(name,email,contact,address,password)values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, admin.getName());
			pst.setString(2, admin.getEmail());
			pst.setLong(3, admin.getContact());
			pst.setString(4, admin.getAddress());
			pst.setString(5, admin.getPassword());
			pst.executeUpdate();
			System.out.println("Admin Registered Succcessfully!!!!");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static Admin adminLogin(Admin a) {
		Admin admin=null;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql= "select * from admin where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, a.getEmail());
			pst.setString(2, a.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				admin = new Admin();
				admin.setId(rs.getInt("a_id"));
				admin.setName(rs.getString("name"));
				admin.setEmail(rs.getString("email"));
				admin.setContact(rs.getLong("contact"));
				admin.setAddress(rs.getString("address"));
				admin.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return admin;
	}

}

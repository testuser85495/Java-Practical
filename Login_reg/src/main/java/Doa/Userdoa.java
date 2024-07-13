package Doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBconnect.connection;
import Model.user;

public class Userdoa {
	public static boolean emailcheck(String email) {
		boolean flag = false;
		try {
			Connection conn = connection.driverConnection();
			String sql = "select * from user where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return flag;
	}
	public static void register(user u) {
		try {
			Connection conn = connection.driverConnection();
			String sql = "insert into user (name,email,password,gender,dob) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setString(2, u.getEmail());
			pst.setString(3, u.getPassword());
			pst.setString(4, u.getGender());
			pst.setString(5, u.getDob());
			pst.executeUpdate();
			System.out.println("Registation Done!! (:");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static user login(user u) {
		user u1 = null;
		try {
			Connection conn = connection.driverConnection();
			String sql="select * from user where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				u1 = new user();
				u1.setId(rs.getInt("id"));
				u1.setName(rs.getString("name"));
				u1.setEmail(rs.getString("email"));
				u1.setDob(rs.getString("dob"));
				u1.setGender(rs.getString("gender"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return u1;
	}
	public static List<user> alluser() {
		List<user> list=new ArrayList<user>();
		try {
			Connection conn = connection.driverConnection();
			String sql="select * from user";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				user u = new user();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setGender(rs.getString("gender"));
				u.setDob(rs.getString("dob"));
				list.add(u);
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	public static void Delete(int id) {
		try {
			Connection conn = connection.driverConnection();
			String sql = "delete from user where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("user deleted");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}

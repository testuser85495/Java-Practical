package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.dbconnection;
import model.user;

public class userdoa {
	public static void insertuser(user u) {
		try {
			Connection conn = dbconnection.driverConnection();
			String sql = "insert into student (name,email,password,address,contact) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setString(2, u.getEmail());
			pst.setString(3, u.getPassword());
			pst.setString(4, u.getAddress());
			pst.setLong(5, u.getContact());
			pst.executeUpdate();
			System.out.println("data insert successfully!!!");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static user loginuser(user u) {
		user u1 = null;
		try {
			Connection conn = dbconnection.driverConnection();
			String sql = "select * from student where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				u1 = new user();
				u1.setId(rs.getInt("id"));
				u1.setName(rs.getString("name"));
				u1.setAddress(rs.getString("address"));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));
				u1.setContact(rs.getLong("contact"));
				System.out.println("login Done");
			}
			System.out.println("login done successfully !!!");
		} catch (Exception e) {
			e.getStackTrace();
		}
		return u1;
	}

	public static boolean emailcheck(String email) {
		boolean flag = false;
		try {
			Connection conn = dbconnection.driverConnection();
			String sql = "select * from student where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;

			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return flag;
	}

	public static List<user> alluser() {
		List<user> list = new ArrayList<user>();
		try {
			Connection conn = dbconnection.driverConnection();
			String sql = "select * from student";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				user u = new user();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				u.setContact(rs.getLong("contact"));
				list.add(u);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return list;
	}

}

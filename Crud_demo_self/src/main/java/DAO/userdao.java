package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBconnector.DBconnection;
import model.user;

public class userdao {
	public static void Insert(user user) {
		try {
			Connection conn = DBconnection.driverconnection();
			String sql ="insert into user(name,email,password)values(?,?,?)";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getPassword());
			pst.executeUpdate();
			
			System.out.println("data insert");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	public static boolean emailcheck(String email) {
		boolean check=false;
		try {
			Connection conn = DBconnection.driverconnection();
			String sql ="select * from user where email=? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				check=true;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		return check;
	}
	public static user login(user u) {
		user u1=null;
		try {
			Connection conn = DBconnection.driverconnection();
			String sql = "select * from user where email=? and password=?";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs =pst.executeQuery();
			if (rs.next()) {
				u1 = new user();
				u1.setId(rs.getInt("id"));
				u1.setName(rs.getString("name"));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return u1;
	}
	public static List<user> alluser() {
		List<user> list = new ArrayList<user>(); 
		try {
			Connection conn = DBconnection.driverconnection();
			String sql = "select * from user";
			PreparedStatement pst= conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
			user u = new user();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				list.add(u);			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		return list;
	}
	public static void updateuser(user u) {
		try {
//			System.out.println("inside upadte");
			Connection conn = DBconnection.driverconnection();
			String sql = "update user set name=?,email=?,password=? where id=?";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setString(2, u.getEmail());
			pst.setString(3, u.getPassword());
			pst.setInt(4, u.getId());
			pst.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	public static user getUserById(int id) {
		user u1 = null;
		try {
			Connection conn = DBconnection.driverconnection();
			String sql="select * from user where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				u1 = new user();
				u1.setId(rs.getInt("id"));
				u1.setName(rs.getString("name"));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}
	public static void deleteUser(int id) {
		try {
			Connection conn = DBconnection.driverconnection();
			String sql="delete from user where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("data deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

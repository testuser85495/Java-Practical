package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import Model.user;
import connection.DBconnection;

public class Userdao {

	public static void insertUser(user u) {
		try {
			Connection conn = DBconnection.driverconnection();
			String sql = "INSERT INTO user(name, email, password, address, country, gender, hobbies) VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setString(2, u.getEmail());
			pst.setString(3, u.getPassword());
			pst.setString(4, u.getAddress());
			pst.setString(5, u.getCountry());
			pst.setString(6, u.getGender());

			String hobbiesArray = String.join(", ", u.getHobbies());
			pst.setString(7, hobbiesArray);

			pst.executeUpdate();
			System.out.println("Data inserted successfully!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<user> getAllUser() {
		List<user> ulist = new ArrayList<>();
		try {
			Connection conn = DBconnection.driverconnection();
			String sql = "SELECT * FROM user";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				user user = new user();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setAddress(rs.getString("address"));
				user.setCountry(rs.getString("country"));
				user.setGender(rs.getString("gender"));
				String hobbiesString = rs.getString("hobbies");
				String[] hobbiesArray = hobbiesString.split(", ");
				user.setHobbies(hobbiesArray);
				ulist.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return ulist;

	}
	
	public static user getUserById(int id) {
		user u =null;
		try {
			Connection conn = DBconnection.driverconnection();
			String sql = "SELECT * FROM user where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				u = new user(); 
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setName(rs.getString("name"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				u.setCountry(rs.getString("country"));
				u.setGender(rs.getString("gender"));
				String hobiesString = rs.getString("hobbies");
				String[] hobbiesArray = hobiesString.split(", ");
				u.setHobbies(hobbiesArray);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return u;
	}

	public static void updateUserById(user u) {
		try {
			Connection conn = DBconnection.driverconnection();
			String sql = "update user set name=?,email=?,address=?,country=?,password=?,gender=?,hobbies=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setString(2, u.getEmail());
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getCountry());
			pst.setString(5, u.getPassword());
			pst.setString(6, u.getGender());
			String hobbiesString = String.join(", ", u.getHobbies());
			pst.setString(7, hobbiesString);
			pst.setInt(8, u.getId());
			pst.executeUpdate();
			System.out.println("User updated");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static void deleteUser(int id) {
		try {
			Connection conn = DBconnection.driverconnection();
			String sql = "delete from user where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("delete User");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

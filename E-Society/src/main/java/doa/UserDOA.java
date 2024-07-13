package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.User;

public class UserDOA {
	public static boolean checkemail(String email) {
		boolean flag=false;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="SELECT * FROM user WHERE email = ? and status='complete' ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs=pst.executeQuery();
			if (rs.next()) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return flag;
	}
	
	public static boolean checkemailstatus(String email) {
		boolean flag=false;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="SELECT * FROM user WHERE email = ? and status='pending' ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs=pst.executeQuery();
			if (rs.next()) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return flag;
	}
	public static boolean checkemailrejectstatus(String email) {
		boolean flag=false;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="SELECT * FROM user WHERE email = ? and status='reject' ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs=pst.executeQuery();
			if (rs.next()) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return flag;
	}
	public static void userRegister(User u) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="insert into user(fname,lname,email,contact,address,password,status) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setLong(4, u.getContact());
			pst.setString(5, u.getAddress());
			pst.setString(6, u.getPassword());
			pst.setString(7, u.getStatus());
			pst.executeUpdate();
			System.out.println("User Register Successfully!!!");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static User userLogin(User u) {
		User  u1= null;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="select * from user where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs= pst.executeQuery();
			if (rs.next()) {
				u1= new User();
				u1.setId(rs.getInt("id"));
				u1.setEmail(rs.getString("email"));
				u1.setFname(rs.getString("fname"));
				u1.setLname(rs.getString("lname"));
				u1.setContact(rs.getLong("contact"));
				u1.setAddress(rs.getString("address"));
				u1.setPassword(rs.getString("password"));
				u1.setStatus(rs.getString("status"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return u1;
		
	}
	public static List<User> userPendingStatus() {
		List<User> list = new ArrayList<User>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="SELECT * FROM user WHERE status ='pending'";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				User u= new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setContact(rs.getLong("contact"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				u.setStatus(rs.getString("status"));
				list.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	public static List<User> userConfirmStatus() {
		List<User> list = new ArrayList<User>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="SELECT * FROM user WHERE status ='complete'";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				User u= new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setContact(rs.getLong("contact"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				u.setStatus(rs.getString("status"));
				list.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	public static List<User> userRejectStatus() {
		List<User> list = new ArrayList<User>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="SELECT * FROM user WHERE status ='reject'";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				User u= new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setContact(rs.getLong("contact"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				u.setStatus(rs.getString("status"));
				list.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	public static void changeStatus(String email) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="update user set status='complete' where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.executeUpdate();
			System.out.println("change status complete");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static void rejectStatus(String email) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="update user set status='reject' where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.executeUpdate();
			System.out.println("Request Reject");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	public static boolean checkpassword(String oldpassword,int id) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="select * from user where id=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, oldpassword);
			ResultSet rs= pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return flag;
	}
	public static void changepassword(String newpassword,int id) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="update user set password=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, newpassword);
			pst.setInt(2, id);
			pst.executeUpdate();
			System.out.println("password change");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static List<User> allUsers() {
		List<User> users=new ArrayList<User>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="select * from user";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				User u= new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setContact(rs.getLong("contact"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				u.setStatus(rs.getString("status"));
				users.add(u);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return users;
	}
	public static User getUserById(int id) {
		User u=null;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="select * from user where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs= pst.executeQuery();
			if (rs.next()) {
				u=new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setContact(rs.getLong("contact"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				u.setStatus(rs.getString("status"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return u;
	}

	

	
}

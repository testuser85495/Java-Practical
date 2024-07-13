package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Complain;
import model.User;

public class ComplainDOA {
	public static void insetComplain(Complain c) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "insert into complain(uid,name,email,complain,date,c_status)values(?,?,?,?,?,?)";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setInt(1, c.getUid());
			pst.setString(2, c.getName());
			pst.setString(3, c.getEmail());
			pst.setString(4, c.getComplain());
			pst.setString(5, c.getDate());
			pst.setString(6, c.getC_status());
//			pst.setString(7, c.getCompletedate());
			pst.executeUpdate();
			System.out.println("complain insert");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static List<Complain> complainById(int uid) {
		List<Complain> list = new ArrayList<Complain>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "select * from complain where uid=? ORDER BY c_status DESC";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				Complain c= new Complain();
				c.setCid(rs.getInt("uid"));
				c.setUid(rs.getInt("uid"));
				c.setName(rs.getString("name"));
				c.setEmail(rs.getString("email"));
				c.setComplain(rs.getString("complain"));
				c.setDate(rs.getString("date"));
				c.setCompletedate(rs.getString("completedate"));
				c.setC_status(rs.getString("c_status"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
 	}
	public static List<Complain> allComplain() {
		List<Complain> list = new ArrayList<Complain>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql = "select * from complain ORDER BY c_status DESC";
			PreparedStatement pst= conn.prepareStatement(sql);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				Complain c = new Complain();
				c.setCid(rs.getInt("cid"));
				c.setUid(rs.getInt("uid"));
				c.setName(rs.getString("name"));
				c.setEmail(rs.getString("email"));
				c.setComplain(rs.getString("complain"));
				c.setDate(rs.getString("date"));
				c.setCompletedate(rs.getString("completedate"));
				c.setC_status(rs.getString("c_status"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}

	
	public static List<Complain> confirmComplain() {
		List<Complain> list = new ArrayList<Complain>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="SELECT * FROM complain WHERE c_status ='complete'";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				Complain c= new Complain();
				c.setCid(rs.getInt("cid"));
				c.setUid(rs.getInt("uid"));
				c.setName(rs.getString("name"));
				c.setEmail(rs.getString("email"));
				c.setComplain(rs.getString("complain"));
				c.setDate(rs.getString("date"));
				c.setCompletedate(rs.getString("completedate"));
				c.setC_status(rs.getString("c_status"));
				list.add(c);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	public static List<Complain> rejectComplain() {
		List<Complain> list = new ArrayList<Complain>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="SELECT * FROM complain WHERE c_status ='reject'";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				Complain c= new Complain();
				c.setCid(rs.getInt("cid"));
				c.setUid(rs.getInt("uid"));
				c.setName(rs.getString("name"));
				c.setEmail(rs.getString("email"));
				c.setComplain(rs.getString("complain"));
				c.setDate(rs.getString("date"));
				c.setCompletedate(rs.getString("completedate"));
				c.setC_status(rs.getString("c_status"));
				list.add(c);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	public static List<Complain> pendingComplain() {
		List<Complain> list = new ArrayList<Complain>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="SELECT * FROM complain WHERE c_status ='pending'";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				Complain c= new Complain();
				c.setCid(rs.getInt("cid"));
				c.setUid(rs.getInt("uid"));
				c.setName(rs.getString("name"));
				c.setEmail(rs.getString("email"));
				c.setComplain(rs.getString("complain"));
				c.setDate(rs.getString("date"));
				c.setC_status(rs.getString("c_status"));
				list.add(c);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	public static void confirmStatus(String email,Complain c) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="update complain set c_status='complete',completedate=? where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getCompletedate());
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("change status complete");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static void rejectStatus(String email,Complain c) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql="update complain set c_status='reject',completedate=?  where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getCompletedate());
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("Request Reject");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}

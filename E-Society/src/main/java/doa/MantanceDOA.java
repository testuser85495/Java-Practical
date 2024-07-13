package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Mantance;

public class MantanceDOA {
	public static void insertMantance(Mantance m) {
			try {
				Connection conn = DBConnection.driverConnection();
				String sql = "insert into mantance(uid,amount,status,date)values(?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, m.getUid());
				pst.setDouble(2, m.getAmount());
				pst.setString(3, m.getStatus());
				pst.setString(4, m.getDate());
				pst.executeUpdate();
				System.out.println("insert mantance");
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	public static void updateStatus(String date ,int uid ) {
		try {
			Connection conn = DBConnection.driverConnection();
			String sql ="update mantance set status='paid',amount=0, date=?  where uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, date);
			pst.setInt(2, uid);
			pst.executeUpdate();
			System.out.println("status change ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkUidExist(int uid) {
		boolean flag = true;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql ="select * from mantance where uid=? and status='unpaid' and amount=500 ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				flag = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static boolean checkStatus(int uid) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.driverConnection();
			String sql ="select * from mantance where uid=? and status='unpaid'";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
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
	public static List<Mantance> mantanceListById(int uid) {
		List<Mantance> list = new ArrayList<Mantance>();
		try {
			Connection conn = DBConnection.driverConnection();
			String sql ="select * from mantance where uid=? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Mantance m = new Mantance();
				m.setUid(rs.getInt("uid"));
				m.setAmount(rs.getDouble("amount"));
				m.setDate(rs.getString("date"));
				m.setStatus(rs.getString("status"));
				m.setMaintenance_Ammount(rs.getDouble("maintenance_Ammount"));
				list.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
				
	}
}

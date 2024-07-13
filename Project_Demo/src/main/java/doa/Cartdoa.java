package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import connection.DBconnection;
import model.cart;

public class Cartdoa {
	public static boolean checkCartItem(int pid,int cid) {
		boolean flag = false;
		try {
			Connection conn = DBconnection.drivConnection();
			String sql = "select * from cart where cid=? and pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cid);
			pst.setInt(2, pid);
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
	public static void insertcart(cart c) {
		try {
			Connection conn = DBconnection.drivConnection();
			String sql ="insert into cart(cid,pid,qty,pprice,pname,pimage,total_price,subtotal,payment) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getCid());
			pst.setInt(2,c.getPid());
			pst.setInt(3, c.getQty());
			pst.setInt(4, c.getPprice());
			pst.setString(5, c.getPname());
			pst.setString(6, c.getPimage());
			pst.setInt(7,c.getTotal_price());
			pst.setInt(8, c.getSubtotal());
			pst.setString(9, c.getPayment());
			pst.executeUpdate();
			System.out.println("added to cart");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static cart getCartByCartId(int cart_id){
		
		cart c = null;
		try {
			Connection conn = DBconnection.drivConnection();
			String sql ="select * from cart where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cart_id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				c = new cart();
				c.setId(rs.getInt("id"));
				c.setCid(rs.getInt("cid"));
				c.setPid(rs.getInt("pid"));
				c.setQty(rs.getInt("qty"));
				c.setPprice(rs.getInt("pprice"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setSubtotal(rs.getInt("subtotal"));
				c.setPname(rs.getString("pname"));
				c.setPimage(rs.getString("pimage"));
				c.setPayment(rs.getString("payment"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
		
	}
	public static List<cart> getCartBycustId(int id) {
		List<cart> list =  new ArrayList<cart>();
		try {
			Connection conn = DBconnection.drivConnection();
			String sql ="select * from cart where cid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				cart c = new cart();
				c.setId(rs.getInt("id"));
				c.setPid(rs.getInt("pid"));
				c.setCid(rs.getInt("cid"));
				c.setQty(rs.getInt("qty"));
				c.setPname(rs.getString("pname"));
				c.setPimage(rs.getString("pimage"));
				c.setPprice(rs.getInt("pprice"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setSubtotal(rs.getInt("subtotal"));
				c.setPayment(rs.getString("payment"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	public static void Deletefromcartbycustid(int id) {
		try {
			Connection conn = DBconnection.drivConnection();
			String sql ="delete from cart where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("delete successfully");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static void updateCart(cart c) {
		try {
			Connection conn = DBconnection.drivConnection();
			String sql ="update cart set qty=?,total_price=?,subtotal=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getQty());
			pst.setInt(2,c.getTotal_price());
			pst.setInt(3, c.getSubtotal());
			pst.setInt(4, c.getId());
			pst.executeUpdate();
			System.out.println("cart updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

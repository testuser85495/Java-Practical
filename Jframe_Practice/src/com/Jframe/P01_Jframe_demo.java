package com.Jframe;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//class newframe1{
//	newframe1(){
//		JFrame fr = new JFrame();
//		fr.setVisible(true);
//		fr.setSize(300, 250);
//		fr.setLayout(null);
//		
//		String input;
//		input = JOptionPane.showInputDialog("Type words:");
//		fr.getContentPane().add(new JLabel(input));
////		fr.add(input);
//	}
//}
class frame implements ActionListener{
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;
	JButton btninsert, btnupdate, btnsearch, btndelete;
	public frame()
	{
		JFrame frame = new JFrame("My App");
		frame.setVisible(true);
		frame.setSize(350, 350);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
//		lables
		l1=new JLabel("ID : ");
		l1.setBounds(50, 50, 120, 20);
		l2=new JLabel("Name: ");
		l2.setBounds(50, 80, 120, 20);
		l3=new JLabel("Contact: ");
		l3.setBounds(50, 110, 120, 20);
		l4=new JLabel("Address: ");
		l4.setBounds(50, 140, 120, 20);
		//text fields
		t1 = new JTextField();
		t1.setBounds(120, 50, 120, 20);
		t2 = new JTextField();
		t2.setBounds(120, 80, 120, 20);
		t3 = new JTextField();
		t3.setBounds(120, 110, 120, 20);
		t4 = new JTextField();
		t4.setBounds(120, 140, 120, 20);
		
//		buttons
		btninsert=new JButton("Insert");
		btninsert.setBounds(50, 200, 80, 20);
		btnupdate=new JButton("Update");
		btnupdate.setBounds(150, 200, 80, 20);
		btnsearch=new JButton("Search");
		btnsearch.setBounds(50, 230, 80, 20);
		btndelete=new JButton("Delete");
		btndelete.setBounds(150, 230, 80, 20);
		
		
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(l3);
		frame.add(t3);
		frame.add(l4);
		frame.add(t4);
		frame.add(btninsert);
		frame.add(btnupdate);
		frame.add(btnsearch);
		frame.add(btndelete);
		
		
		btninsert.addActionListener(this);
		btnupdate.addActionListener(this);
		btnsearch.addActionListener(this);
		btndelete.addActionListener(this);
		
	}

//	

	public static Connection driverConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
		} catch (Exception e) {
			e.getStackTrace();
		}
		return conn;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		if (e.getSource()== btninsert) {
			System.out.println("insert btn clicked");
			int id =Integer.parseInt(t1.getText());
			String name =t2.getText();
			long contact = Long.parseLong((t3.getText()));
			String address =t4.getText();
			System.out.println(id+name+contact+address);
			try {
				Connection conn =frame.driverConnection();
				String sql = "insert into us(id,name,contact,Address) values(?,?,?,?)";
				PreparedStatement pst= conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setLong(3, contact);
				pst.setString(4, address);
				
				pst.executeUpdate();
				
				System.out.println("insert successfully");
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			} catch (Exception e2) {
				e2.getStackTrace();
			}
			
		}
		else if (e.getSource()==btnupdate) {
			System.out.println("Update btn clicked");
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
			long contact = Long.parseLong(t3.getText());
			String address = t4.getText();
			
			try {
				Connection conn = frame.driverConnection();
				String sql = "update us set name=?,contact=?,Address=?  where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, name);
				pst.setLong(2, contact);
				pst.setString(3, address);
				pst.setInt(4, id);
				
				pst.executeUpdate();
				System.out.println("data update");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
				
			} catch (Exception e2) {
				e2.getStackTrace();
			}
//			
		}
		else if (e.getSource()==btnsearch) {
			System.out.println("Search btn clicked");
			
			int id = Integer.parseInt(t1.getText());
			try {
				Connection conn = frame.driverConnection();
				String sql = "select * from us where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
					t1.setText(String.valueOf(rs.getInt("id")));
					t2.setText(rs.getString("name"));
					t3.setText(String.valueOf(rs.getLong("contact")));
					t4.setText(rs.getString("address"));
				} else {
					System.out.println("data not found");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
//					new newframe1();
					JOptionPane.showMessageDialog(null, "data not found");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		else if (e.getSource()==btndelete) {
			System.out.println("Delete btn clicked");
			int id = Integer.parseInt(t1.getText());
			try {
				Connection conn =frame.driverConnection();
				String sql = "DELETE FROM us WHERE id=?";
				PreparedStatement  pst= conn.prepareStatement(sql);
				pst.setInt(1, id);
				
				pst.executeUpdate();
				System.out.println("data deleted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}
	
}
public class P01_Jframe_demo {

	public static void main(String[] args) {
		new frame();
		//System.out.println("hello");
	}

}

package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
	public static Connection driverConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
		} catch (Exception e) {
			e.getStackTrace();
		}
		return conn;
	}
}

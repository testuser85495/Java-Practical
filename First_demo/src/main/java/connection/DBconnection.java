package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
 
	public static Connection driverconnection() {
		Connection conn=null;
		try {
			// driver name -> forName responsible to load driver into project
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connectivity URL
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs", "root", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}

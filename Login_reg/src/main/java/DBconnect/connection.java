package DBconnect;
import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	public static Connection driverConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/log_user","root","");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return conn;
	}

}

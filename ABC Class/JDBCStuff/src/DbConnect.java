import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Sucessfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver Not Loaded");
		}
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@//127.0.0.1:1521/XE", "system", "system");
			System.out.println("Connection Established Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection is not Established");
		}
	}

}

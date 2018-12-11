import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			System.out.println("Driver Loaded Sucessfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not Loaded");
		}

	}

}

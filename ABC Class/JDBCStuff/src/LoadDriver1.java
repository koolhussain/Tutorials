import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class LoadDriver1 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver has been Loaded");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not Loaded");
		}
	}

}

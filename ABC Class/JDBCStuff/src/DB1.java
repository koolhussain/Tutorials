import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not Loaded");
		}
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@//127.0.0.1:1521/XE", "system", "system");
			System.out.println("Connection established successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection not established");
		}
		
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery("SELECT * FROM STUDENT");
			System.out.println("Query Executed Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Query not executed");
		}
		
		try {
			while(res.next()==true) {
				int a = res.getInt(1);
				String b = res.getString(2);
				int c = res.getInt(3);
				int d = res.getInt(4);
				int e = res.getInt(4);
				float f = res.getFloat(6);
				System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Result Not Found");
		}
	}

}

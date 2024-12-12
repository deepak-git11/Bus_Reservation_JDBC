package BusReservation;
import java.sql.*;

public class DbCon {
	private static final String url = "jdbc:mysql://localhost:3306/busreservation";
	private static final String userName = "root";
	private static final String passWord = "deepak93611@";
	
	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(url,userName,passWord);
	}

}

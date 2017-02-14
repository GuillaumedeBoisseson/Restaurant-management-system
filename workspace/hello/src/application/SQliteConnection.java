package application;
import java.sql.*;


//this code was found on a tutorial, retrieved on the 07/12/2016, available at: https://www.youtube.com/watch?v=nTm1rzhHOc8


public class SQliteConnection {
	public static Connection Connector() {
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn =DriverManager.getConnection("jdbc:sqlite:test1.sqlite");
			return conn;
		}
		
		catch (Exception e){
			return null;
		}
	}

}

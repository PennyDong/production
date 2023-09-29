package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connection conn = new DbConnection().getDb();
		//System.out.println(conn);
	}
	
	
	public static Connection getDb() {
		
		Connection conn = null;
		String url="jdbc:mysql://localhost:3306/porderjsp";
		String username = "root";
		String password = "m9yqv366";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}

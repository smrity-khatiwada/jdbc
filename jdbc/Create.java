package jdbc;

import java.sql.*;

public class Create {
	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/Smriti";
		final String username ="root";
		final String pwd ="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connxn = DriverManager.getConnection(url,username,pwd);
			Statement stmt = connxn.createStatement();
			stmt.executeUpdate("CREATE DATABASE Smriti");
			System.out.println("database created");
			connxn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

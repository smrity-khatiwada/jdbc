package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreate {
	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/Smriti";
		final String username = "root";
		final String pwd = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connxn = DriverManager.getConnection(url, username, pwd);
			Statement stmt = connxn.createStatement();
			String query = "CREATE TABLE student(" + "ID int NOT NULL," + "NAME VARCHAR(20) NOT NULL,"

					+ "ADDRESS VARCHAR(20))";

			stmt.executeUpdate(query);
			System.out.println("table created");
			connxn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

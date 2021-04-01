package jdbc;
import java.sql.*;
public class Select {
	public static void main(String[] args) {
		final String url="jdbc:mysql://localhost:3306/Smriti";
		final String username ="root";
		final String pwd ="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connxn= DriverManager.getConnection(url, username , pwd);
			Statement stmt= connxn.createStatement();
			ResultSet r=stmt.executeQuery("SELECT *FROM student");
			while(r.next()) {
				System.out.println("id: "+r.getInt(1));
				System.out.println("Name:"+r.getString(2));
				System.out.println("address:"+r.getString(3));
			}
			connxn.close();
			}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}

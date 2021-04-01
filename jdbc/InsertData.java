package jdbc;
import java.sql.*;
public class InsertData {
	
	public static void main(String[] args) {
		final String url="jdbc:mysql://localhost:3306/Smriti";
		final String username="root";
		final String pwd="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connxn= DriverManager.getConnection(url,username,pwd);
			Statement stmt = connxn.createStatement();
			int i= stmt.executeUpdate("insert into student values(1,'arun','patan'),(2, 'sita','kapan')");
			System.out.println("Row Affected="+i);
			connxn.close();
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}

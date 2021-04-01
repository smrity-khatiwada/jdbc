package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Update {
	public static void main(String[] args) {
		final String url="jdbc:mysql://localhost:3306/Smriti";
		final String username="root";
		final String pwd="";
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connxn= DriverManager.getConnection(url,username,pwd);
		Statement stmt = connxn.createStatement();
		int i= stmt.executeUpdate("UPDATE student SET name='hari' ");
		System.out.println("Row Affected="+i);
		connxn.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}

}
		


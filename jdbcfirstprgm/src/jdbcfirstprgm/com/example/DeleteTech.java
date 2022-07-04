package jdbcfirstprgm.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteTech {
public static void main(String[] args) throws SQLException {
	
	String url="jdbc:mysql:localhost:3306";
	String user="root";
	String password="techouts";
	
	Connection con=DriverManager.getConnection(url,user,password);
	String query="delete from spring.tech where id=120";
	
	
	
	
	
	
	
	
}
}

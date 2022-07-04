package jdbcfirstprgm.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTech {
public static void main(String[] args) throws SQLException {
	String url="jdbc:mysql://localhost:3306";
	String user="root";
	String password="techouts";
	Connection con=DriverManager.getConnection(url,user,password);
	 String query="select * from spring.tech where id=120";
	 Statement stm=con.createStatement();
	 ResultSet rs=stm.executeQuery(query);
	 if(rs.next()) {
		 
		 System.out.println("tech info"+rs.getString("id")+" "+rs.getString("eName")+""+rs.getString("email")+""+rs.getString("eSalary"));
		 
	 }
	 else
	 {
		 System.out.println("error");
	 }
	
	
	
	
	
	
}
}


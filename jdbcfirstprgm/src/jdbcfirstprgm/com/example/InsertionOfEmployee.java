package jdbcfirstprgm.com.example;
import java.sql.*;

public class InsertionOfEmployee 
{
    
	public static void main(String[] args) 
	{
	  String url="jdbc:mysql://localhost:3306/";
	  String user="root";
	  String password="techouts";
	  
	  String query="insert into spring.tech values(120,'Rohith','dara.@gmail.com','Ten_thousand')";
	  
	  try {
		Connection conn=DriverManager.getConnection(url,user,password);
		Statement stm=conn.createStatement();
		int rs=stm.executeUpdate(query);
		
		if(rs>0)
		{
			System.out.println("connection successfull");
		}
		conn.close();
		
		
		
	   }
	  catch (SQLException e) 
	  {
		
		e.printStackTrace();
	}
	}
	
	
	
}

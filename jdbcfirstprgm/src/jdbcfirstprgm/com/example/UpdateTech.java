package jdbcfirstprgm.com.example;
import java.sql.*;

public class UpdateTech 
{
    
	public static void main(String[] args) 
	{
	  String url="jdbc:mysql://localhost:3306/";
	  String user="root";
	  String password="techouts";
	  
	  String query="update spring.tech set eSalary='Five_thousand' where id=120";
	  
	  try {
		Connection conn=DriverManager.getConnection(url,user,password);
		Statement stm=conn.createStatement();
		int rs=stm.executeUpdate(query);
		
		if(rs>0)
		{
			System.out.println("spring.tech table Updated Successfully");
		}
		else
		{
			System.out.println("Failed to Update....");
		}
		conn.close();
		
		
		
	   }
	  catch (SQLException e) 
	  {
		
		e.printStackTrace();
	}
	}
	
	
	
}

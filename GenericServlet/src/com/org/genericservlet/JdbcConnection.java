package com.org.genericservlet;

import java.sql.*;

public class JdbcConnection 
{
   public static void main(String[] args) throws SQLException
   {
	   String url="jdbc:mysql://localhost:3306/spring";
	   String user="root";
	   String pass="techouts";
	    
	   Connection conn=DriverManager.getConnection(url,user,pass);
	   
	   System.out.println("connected");
	   
   }
}

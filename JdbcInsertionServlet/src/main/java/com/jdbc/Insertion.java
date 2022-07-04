package com.jdbc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
@WebServlet("/Insertion")
public class Insertion  extends HttpServlet
{

 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	 String s=req.getParameter("name1");
		int id1=Integer.parseInt(s);
		String s1=req.getParameter("name2");
		String s2=req.getParameter("name3");
		String s3=req.getParameter("name4");
      Scanner sc=new Scanner(System.in);
		
		String url= "jdbc:mysql://localhost:3306";
		String user="root";
		String password="techouts";
		String query="insert into spring.tech values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement ps=con.prepareStatement(query);
			//int roll=sc.setint(id1);
			PrintWriter w=resp.getWriter();
			System.out.println("enter the id value");
			ps.setInt(1, id1);
			System.out.println("enter the name");
			ps.setString(2, s1);
			System.out.println("enter the email");
			ps.setString(3, s2);
			System.out.println("enter the salary in words");
			ps.setString(4, s3);
			int rs=ps.executeUpdate();
			if(rs>0)
			{
				System.out.println("okkkk");
				w.println("insertion successfull");
			}else
			{
				System.err.println("error");
			}
			con.close();
			
		} catch (SQLException|ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	
 }	
}

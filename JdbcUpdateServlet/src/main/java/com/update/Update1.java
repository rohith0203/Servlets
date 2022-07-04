package com.update;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Driver;
@WebServlet("/Update1")
public class Update1 extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String i=req.getParameter("name1");
	String id1=req.getParameter("name2");
	int id=Integer.parseInt(id1);
	//String salary=req.getParameter("name3");
	PrintWriter p=resp.getWriter();
	
	String url="jdbc:mysql://localhost:3306";
	String user="root";
	String password="techouts";
  String query="update  spring.tech set email=? where id=?";

  try {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn=DriverManager.getConnection(url,user,password);
	PreparedStatement ps=cn.prepareStatement(query);
	//p.println("enter updted email");
	ps.setString(1,i);
	//p.println("Enter the id where you want to update");
	ps.setInt(2,id);
//	ps.setString(3,salary);
	int rs=ps.executeUpdate();
	
	if(rs>0)
	{
		System.out.println("sucessfully data entered");
		System.out.print("values assigned go and check msql");
	}
	else
	{
		System.out.println("error");
	}
	
	
	
	
	
	
	
	
} catch (SQLException|ClassNotFoundException e) {
	
	e.printStackTrace();
}

	
	
	
	
	
	
}
}

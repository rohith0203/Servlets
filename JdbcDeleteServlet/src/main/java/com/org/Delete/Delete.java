package com.org.Delete;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String number=req.getParameter("name1");
		int id=Integer.parseInt(number);
		PrintWriter p=resp.getWriter();
		String url="jdbc:mysql://localhost:3306";
		String user="root";
	    String password="techouts";
		String query="delete from spring.tech where id=?";
		Scanner sc=new Scanner (System.in);
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cnn=DriverManager.getConnection(url,user,password);
			 
			PreparedStatement ps=cnn.prepareStatement(query);
			ps.setInt(1,id);
			
			int rs=ps.executeUpdate();
			 if(rs>0)
			 {
				 System.out.println("query sucessfullyb executed");
			 }
			 else
			 {
				 System.out.println("error");
			 }
			
		cnn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}

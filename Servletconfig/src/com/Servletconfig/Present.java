package com.Servletconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Present extends HttpServlet{
 
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 PrintWriter p=resp.getWriter();
		 ServletConfig con=getServletConfig();
		 p.print(con.getInitParameter("email"));
		 
		 
		 
		 
	}
	
	
}
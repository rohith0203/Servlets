package com.org.Generic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Addition extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter(); 
		String a=req.getParameter("name1");
		String b=req.getParameter("name2");
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		
		pw.println("addition of 2 nos is::"+(x+y));
		
	}
	
}

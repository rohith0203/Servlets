package com.org.genericservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 String s1=req.getParameter("name1");
		 String s2=req.getParameter("name2");
		 
		 PrintWriter print=res.getWriter();
		 
		 if(s2.equals("password"))
		 {
			 print.println("login sucessfull");
		 }
		 else
		 {
			 print.println("you entered the wrong password");
		 }
		
	}

}

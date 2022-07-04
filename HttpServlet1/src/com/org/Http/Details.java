package com.org.Http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Details extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name1");
		String m=req.getParameter("name2");
		int number=Integer.parseInt(m);
		String mail=req.getParameter("name3");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<p> Name :: " + name + "</p>");
        printWriter.print("<p> number :: " + number + "</p>");
        printWriter.print("<p> mail :: " + mail + "</p>");
        
        
//        System.out.println("Name :: " + name);
//        System.out.println("number :: " + number);
//        System.out.println("email :: " + mail);
//		
	}
	
	
}

package com.org.Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogOutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter p=resp.getWriter();  
         
         
	        req.getRequestDispatcher("Link.html").include(req,resp);  
	          
	        Cookie ck=new Cookie("name","");  
	        ck.setMaxAge(0);  
	        resp.addCookie(ck);  
	          
	        p.print("you are successfully logged out");  
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

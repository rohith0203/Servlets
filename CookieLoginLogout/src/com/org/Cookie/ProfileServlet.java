package com.org.Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter p=resp.getWriter();  
        
        req.getRequestDispatcher("Link.html").include(req, resp);  
          
        Cookie ck[]=req.getCookies();  
        if(ck!=null){  
         String name=ck[0].getValue();  
        if(!name.equals("")||name!=null){  
            p.print("<b>Welcome to Profile</b>");  
          p.print("<br>Welcome, "+name);  
        }  
        }else{  
            p.print("Please login first");  
            req.getRequestDispatcher("login.html").include(req, resp);  
        }  
		
		
		
		
		
	}
	
	
	
	
	
	
}

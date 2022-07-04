package com.org.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String s=req.getParameter("user");
		out.println("welcome"+s);
		
		Cookie ck=new Cookie("unuser",s);
		resp.addCookie(ck);
		
		
		 out.print("<form action='snd'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
		          
		
		
	}
	
	
	

}

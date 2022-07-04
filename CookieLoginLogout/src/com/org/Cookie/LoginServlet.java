package com.org.Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter p=resp.getWriter();
	
	RequestDispatcher re=req.getRequestDispatcher("Link.html");
	
   re.include(req, resp);
	
	String name=req.getParameter("username");
	String passwordq=req.getParameter("password1");
	
	if(passwordq.equals("password123"))
	{
		p.print("you are sucessfully loged in");
		p.print("Welcome:"+name);
		Cookie c=new Cookie("name",name);
		resp.addCookie(c);
		
	}else
	{
		p.print("sorry your password is incorrect");
		RequestDispatcher re1=req.getRequestDispatcher("login.html");
		re1.include(req, resp);
		
	}
}
}

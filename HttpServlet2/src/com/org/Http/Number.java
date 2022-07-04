package com.org.Http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Number extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String a=req.getParameter("name1");
	int number=Integer.parseInt(a);
	PrintWriter p=resp.getWriter();
	if(number%2==0)
	{
		p.print("given number is even");
	}else
	{
		p.print("given number is not even");
	}
	
	
	
	
	
	
	
	
	
	
}
}

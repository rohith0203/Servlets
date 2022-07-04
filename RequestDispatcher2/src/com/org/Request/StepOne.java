package com.org.Request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StepOne extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String a=req.getParameter("name1");
		int num=Integer.parseInt(a);
		PrintWriter p=resp.getWriter();
		
if(num%2==0)
{
	RequestDispatcher re=req.getRequestDispatcher("in");
	re.forward(req,resp);
}else
{
	RequestDispatcher re=req.getRequestDispatcher("out");
	re.forward(req,resp);
	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}

package com.org.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StepOne extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p=resp.getWriter();
		
		String ss=req.getParameter("name1");
		p.print("welcome"+ss);
		
		
		p.print("<form action='StepTwo'");
        p.print("<input type='hidden' name='hiddenname' value='"+ss+"'>");  
        p.print("<input type='submit' value='next1'>");
		p.print("</form>");

     //p.print("<a href='StepTwo'>link-to -next</a>");		
		
		
		
		
		
	}
	
	
	
}

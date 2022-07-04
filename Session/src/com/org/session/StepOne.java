package com.org.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StepOne extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name1");
		PrintWriter p=resp.getWriter();
		
		p.print("welcome"+name);
		
		HttpSession ses=req.getSession();
		ses.setAttribute("nameResult",name);
		
		p.print("<a href='StepTwo2'>visit to next</a>");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

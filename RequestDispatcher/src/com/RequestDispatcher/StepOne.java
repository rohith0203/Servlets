package com.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StepOne  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String box1=req.getParameter("type1");
	String box2=req.getParameter("type2");
	
	PrintWriter p=resp.getWriter();
	
	if(box2.equals("servlet"))
	{
		RequestDispatcher r=req.getRequestDispatcher("in");
		r.forward(req, resp);
	}else
	{
		p.print("sorry you entered pass/user are in-valid");
		RequestDispatcher r=req.getRequestDispatcher("/Dispatcher.html");
		r.include(req, resp);
	}
	
}
}

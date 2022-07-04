package com.SendDirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Google extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String n=req.getParameter("name1");
	resp.sendRedirect("https://www.google.co.in/#q="+n);
	
	
	
	
	
	
	
	
	
}
}

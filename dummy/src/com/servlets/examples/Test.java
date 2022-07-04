package com.servlets.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter printWriter = resp.getWriter();
		int i =Integer.parseInt(req.getParameter("value1"));
		int j =Integer.parseInt(req.getParameter("value2"));
		System.out.println(i+j);
		printWriter.print(i+j);
	}

}

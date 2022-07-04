package url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StepOne extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	PrintWriter p=resp.getWriter();
	String s=req.getParameter("name1");
	p.print("Welcome"+s);
	
	
	
	p.print("<a href='second?name1="+s+"'>visit</a>");
	
	
	
	
	
	
	
	
	
	
	
	
}
}

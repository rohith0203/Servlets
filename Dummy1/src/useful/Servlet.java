package jdbcfirstprgm.com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		 res.setContentType("text/html");  
	        PrintWriter out=res.getWriter();  
	        String id =req.getParameter("id");  
	        String name=req.getParameter("eName"); 
	        String email=req.getParameter("email");
	        String salary=req.getParameter("eSalary");
	        
	          
	}
	

}


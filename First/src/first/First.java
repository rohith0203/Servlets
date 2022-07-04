package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/First")
public class First extends HttpServlet
{

	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	
      int n1=Integer.parseInt(req.getParameter("no1"));
      
      int n2=Integer.parseInt(req.getParameter("no2"));
      
      PrintWriter p=resp.getWriter();
      p.println("add of 2 nos :"+(n1+n2));
		
	}

		
		
		
		
		
		


}

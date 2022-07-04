package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Firstprblm extends HttpServlet  
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(req.getParameter("a1"));
		int b=Integer.parseInt(req.getParameter("a2"));
		System.out.println(a);
		System.out.println(b);
		PrintWriter p=res.getWriter();
		p.println("Addition of two numbers::::"+(a+b));  
	}
}

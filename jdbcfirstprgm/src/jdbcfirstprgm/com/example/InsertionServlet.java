package jdbcfirstprgm.com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/InsertionServlet")
public class InsertionServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s=req.getParameter("name1");
		int id1=Integer.parseInt(s);
		String s1=req.getParameter("name2");
		String s2=req.getParameter("name3");
		String s3=req.getParameter("name4");
 Scanner sc=new Scanner(System.in);
		
		String url= "jdbc:mysql:localhost:3306";
		String user="root";
		String password="techouts";
		String query="insert into spring.tech values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement ps=con.prepareStatement(query);
			//int roll=sc.setint(id1);
			System.out.println("enter the id value");
			ps.setInt(1, id1);
			System.out.println("enter the name");
			ps.setNString(2, s1);
			System.out.println("enter the email");
			ps.setNString(3, s2);
			System.out.println("enter the salary in words");
			ps.setNString(4, s3);
			int rs=ps.executeUpdate();
			if(rs>0)
			{
				System.out.println("okkkk");
			}else
			{
				System.out.println("error");
			}
			con.close();
			
		} catch (SQLException|ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
}

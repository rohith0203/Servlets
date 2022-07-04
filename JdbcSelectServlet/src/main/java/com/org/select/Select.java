package com.org.select;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Select")
public class Select extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String i = req.getParameter("name1");
		int id = Integer.parseInt(i);
		PrintWriter p = resp.getWriter();

		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String password = "techouts";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String query = "select * from spring.tech where id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				p.println("the employee id is " + rs.getInt("id") + "   " + rs.getString("eName") + " "
						+ rs.getString("email") + "  ");
			} else {
				System.err.println("wrong input");
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

//private String getName(String string) {
//	// TODO Auto-generated method stub
//	rprivate String getSalary(String string) {
//	// TODO Auto-generated method stub
//	return null;
//}eturn null;
//}
//
//private String getId(String string) {
//	// TODO Auto-generated method stub
//	return null;
//}
//}

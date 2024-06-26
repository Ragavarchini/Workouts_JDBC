package Myserv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;


@WebServlet("/calci")
public class calci extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbsql", "root", "root");
			String reg = req.getParameter("f1");
			String pass = req.getParameter("f2");
			
			
			String str = "select * from students where Rno = ? and pass = ?";
			PreparedStatement ps = cn.prepareStatement(str);
		     ps.setString(1,reg);
		     ps.setString(2,pass);
		     
		     ResultSet rs = ps.executeQuery();
		     
		     if(rs.next()) {
		    	 int s = rs.getInt("Rno");
		    	 int p = rs.getInt("Pass");
		    	 int m1 = rs.getInt("mark1");
		    	 int m2 = rs.getInt("mark2");
		    	 PrintWriter pw = null;
				try {
					pw = res.getWriter();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	 pw.println("Rno: " + s+ " mark1: " +m1+ " mark2: " +m2);
		      }
		    else {
		    	 PrintWriter pw = null;
				try {
					pw = res.getWriter();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	 pw.println("Invalid register number or password!!...");
		     }
		     	      
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}

}

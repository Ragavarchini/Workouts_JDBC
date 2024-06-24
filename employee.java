package javaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
try {
			
			Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbsql","root","root");
			
		    String str1 = "insert into employees values(?,?,?,?,?,?);";
		    Scanner sc = new Scanner(System.in);
		    PreparedStatement ps = con.prepareStatement(str1);
		    
		    System.out.println("enter details");
		    
		    
		    System.out.println("enter employee id");
		   
		    ps.setInt(1,sc.nextInt() );
		    
		    System.out.println("enter employee name");
		    ps.setString(2, sc.next());
		    System.out.println("enter employee salary");
		    ps.setInt(3, sc.nextInt());
		    System.out.println("enter age");
		    ps.setInt(4, sc.nextInt());
		    System.out.println("enter gender");
		    ps.setString(5, sc.next());
		    System.out.println("Date of join");
		    ps.setString(6, sc.next());
		    
		    ps.execute()
;		    String str2 = "select * from employees;";
		    PreparedStatement p1 = con.prepareStatement(str2);
			ResultSet rs = p1.executeQuery(str2);
		    while(rs.next()) {
		    	int E_id=rs.getInt(1);
				String E_name=rs.getString(2);
				int salary=rs.getInt(3);
				int age = rs.getInt(4);
				String gender=rs.getString(5);
				String D_O_J=rs.getString(6);
				System.out.println("Table Employees: " + E_id +" " + E_name +" " + salary +" "+ age + " " + gender + " " + D_O_J);
				
		    }
			
			
          } catch (SQLException e) {
  			e.printStackTrace();
  		}
  		
		
		

	}

}

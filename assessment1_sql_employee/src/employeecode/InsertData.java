package employeecode;

import java.sql.*;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dburl = "jdbc:mysql://localhost:3306/example";
		String username = "root";
		String password = "chaithu@12";
		
		try {
			Connection conn = DriverManager.getConnection(dburl,username,password);
			String sql = "INSERT INTO employee (NAME,AGE,SALARY,EMAIL) VALUES (?,?,?,?)";
			 PreparedStatement statement = conn.prepareStatement(sql);
			 statement.setString(1,"chaithanya");
			 statement.setString(2,"twenty one");
			 statement.setString(3,"eightfive lakhs");
			 statement.setString(4,"chaithanya2k3@gmail.com");
			 int rowsInserted = statement.executeUpdate();
			 
			 if (rowsInserted > 0) {
			        System.out.println("A new user was inserted successfully!");
			 }
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
			 
			
					
		
		
	}



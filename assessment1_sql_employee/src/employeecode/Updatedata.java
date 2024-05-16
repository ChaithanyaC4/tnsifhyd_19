package employeecode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updatedata {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/example";
		String username = "root";
		String password = "chaithu@12";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE employee SET NAME=?, AGE=?, SALARY=?, EMAIL=? WHERE ID=5";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "321");
		    statement.setString(2, "chintanya");
		    statement.setString(3, "chaithuu@microsoft.com");
		    statement.setString(4, "chay");
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}


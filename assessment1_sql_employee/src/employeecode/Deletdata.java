package employeecode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletdata {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/example";
		String username = "root";
		String password = "chaithu@12";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM employee WHERE NAME=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "chaithu");
		     
		    int rowsDeleted = statement.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("A user was deleted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}


package employeecode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrivedata {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/example";
		String username = "root";
		String password = "chaithu@12";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int count = 0;
			 
			while (result.next()){
			    String name = result.getString(1);
			    String pass = result.getString(3);
			    String fullname = result.getString("NAME");
			    String email = result.getString("ID");
			 
			    String output = "User #%d: %s - %s - %s - %s";
			    System.out.println(String.format(output, ++count, name, pass, fullname, email));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}

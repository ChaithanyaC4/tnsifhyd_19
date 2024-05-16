package employeecode;
import java.sql.*;

public class Usersmanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String dbURL = "jdbc:mysql://localhost:3306/example";
			String username = "root";
			String password = "chaithu@12";
			 
			try {
			 
			    Connection conn = DriverManager.getConnection(dbURL, username, password);
			 
			    if (conn != null) {
			        System.out.println("Connected to the database");
			        conn.close();
			    }
			} catch (SQLException ex) {
				ex.printStackTrace();
			    		

			}
		} 


	

}

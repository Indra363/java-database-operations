package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CreateDB {

	public static void main(String[] args) {
		

		try {
			
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "Root@0808";

			Connection con = DriverManager.getConnection(url, userName, password);
			Statement st = con.createStatement();

			st.executeUpdate("CREATE DATABASE IF NOT EXISTS testDB");
//			st.executeUpdate("USE testDB");
//			st.executeUpdate(
//			    "CREATE TABLE IF NOT EXISTS students (" +
//			    "id INT PRIMARY KEY AUTO_INCREMENT, " +
//			    "name VARCHAR(100) NOT NULL" +
//			    ")");
//			    
                st.close();
				con.close();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		JOptionPane.showMessageDialog(null, "Database & Table created successfully");

	}

}

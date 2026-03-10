package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Create_TableInDB {

	public static void main(String[] args) throws Exception{
		
		try {
			//create the connection
			String url = "jdbc:mysql://localhost:3306/dbName";
			
			String userName = "root";
			String password = "Root@0808";
			
			Connection con = DriverManager.getConnection(url, userName, password);
			
			String sql = "CREATE TABLE IF NOT EXISTS students("
			+"id INT PRIMARY KEY AUTO_INCREMENT,"+
			"name VARCHAR( 100 )NOT NULL"+
			")";
			
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			st.close();
			con.close();
			JOptionPane.showMessageDialog(null,"Table created successfully");
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}

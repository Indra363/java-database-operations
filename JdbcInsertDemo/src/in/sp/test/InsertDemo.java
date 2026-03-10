package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		//1.load driver
		Class.forName("com.mysql.cj.jdbc.Driver");//driver class
		//compile time exception
		// use try-catch or throws Exception to handle
		
		//2.Create Connection 
		//load mysql connector jar
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Root@0808");
		
		//3.create statement
		PreparedStatement ps = con.prepareStatement("INSERT INTO register VALUES('Indra', 'indra@gmail.com', '123', 'Female', 'Banka')");
		
		//4.Execute SQL statement
		int i = ps.executeUpdate();
		//return value=int
		//0=false and 1=true
		
		//check execution is successful or not
		if(i > 0) {
			System.out.println("Execution successful");
		}else {
			System.out.println("Execution fail");
		}
		
		//5.close connection
		con.close();

	}

}

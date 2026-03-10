package in.sp.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {

	public static void main(String[] args)throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school",
				"root", "Root@0808");
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM students"); 
		
		ResultSet rs =	ps.executeQuery();
		while(rs.next()) {
			int roll = rs.getInt("roll");
			System.out.println("Roll no: "+roll);
			
			String name = rs.getString("name");
			System.out.println("Name: "+name);
			
			String email = rs.getString("email");
			System.out.println("Email: "+email);
			
			String gender = rs.getString("gender");
			System.out.println("Gender: "+gender);
			
			String created_at = rs.getString("created_at");
			System.out.println("Date & Time of creation: "+created_at);
			System.out.println("--------------------");
		}
	}

}

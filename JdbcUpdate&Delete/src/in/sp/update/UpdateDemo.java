package in.sp.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll of student you want to update");
		int roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new name for that student");
		String name = sc.nextLine();
		System.out.println("Enter new email for that student");
		String email = sc.nextLine();
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Root@0808");
		
		PreparedStatement ps = con.prepareStatement("UPDATE students Set name=?, email=? WHERE roll=?");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setInt(3, roll);
		
		int i = ps.executeUpdate();
		
		if(i > 0) {
			System.out.println("Execution successful");
		}else {
			System.out.println("Execution failed");
		}
		
		con.close();
  }

}

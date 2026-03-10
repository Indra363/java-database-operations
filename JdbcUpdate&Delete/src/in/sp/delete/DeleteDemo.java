package in.sp.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class DeleteDemo {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter roll no of student you want to delete");
		int roll = sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");//driver class name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Root@0808");
		
		PreparedStatement ps =	con.prepareStatement("DELETE FROM students WHERE roll = ?");
		ps.setInt(1, roll);
		
		int i = ps.executeUpdate();
		if(i > 0) {
			System.out.println("Execution Successful");
		}else {
			System.out.println("Execution Failed");
		}
 }

}

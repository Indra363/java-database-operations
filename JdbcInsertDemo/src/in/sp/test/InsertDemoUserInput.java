package in.sp.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemoUserInput {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Roll no of Student");
		int roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of Student");
		String name = sc.nextLine();
		System.out.println("Enter Email id of Student");
		String email = sc.nextLine();
		System.out.println("Enter Gender of Student");
		String gender = sc.nextLine();
		System.out.println("Enter Address of Student");
		String address = sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "Root@0808");
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO students(roll, name, email,gender, address) VALUES(?,?,?,?,?)");//positional parameter
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, gender);
		ps.setString(5, address);
		
		int rows = ps.executeUpdate();
		System.out.println(rows+" rows added successfully");
		
		con.close();

	}

}

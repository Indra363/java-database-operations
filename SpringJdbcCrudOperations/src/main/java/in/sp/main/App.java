package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowMapper;
import in.sp.resources.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       
       JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
       //get its bean to use crud operation methods
       
       //-----------Insert operation-------------
       
//       int std_rollno = 48;
//       String std_name = "Indra Prtibha";
//       float std_marks = 98.6f;
//       
//       String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//       int count = jdbcTemplate.update(insert_sql_query, std_rollno, std_name, std_marks);
//       
//       if(count > 0) {
//    	   System.out.println("Insertion successful");
//       }else {
//    	   System.out.println("Insertion failed");
//       }
       
       //------------Update operation------------
       
//       float marks = 99.5f;
//       int rollno = 48;
//       
//       String update_sql_query = "UPDATE student SET marks=? WHERE std_roll=?";
//       int count = jdbcTemplate.update(update_sql_query, marks, rollno);
//       
//       if(count > 0) {
//    	   System.out.println("Updated successfully");
//       }else {
//    	   System.out.println("Not updated");
//       }
       
       //------------DELETE OPERATION--------------
//       int rollno = 102;
//       
//       String delete_sql_query = "DELETE FROM student WHERE std_roll=?";
//       int count = jdbcTemplate.update(delete_sql_query);
//       
//       if(count > 0) {
//    	   System.out.println("Deleted successfully");
//       }else {
//    	   System.out.println("Not Deleted");
//       }
       
       //-----------------SELECT OPERATION---------------
       String select_sql_query = "SELECT * FROM student";
       List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
       
       for(Student std : std_list) {
    	   System.out.println("Rollno : "+std.getRollno());
    	   System.out.println("Name : "+std.getName());
    	   System.out.println("Marks : "+std.getMarks());
    	   System.out.println("------------------");
       }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class DateHandlingRetrieve {

	public static void main(String[] args) throws Exception{
		// retrieve date and 
				//process them to different format 
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				String sqlStmt = "select * from employee";
				String connectionUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
				
				try (
					Connection conn = DriverManager.getConnection(connectionUrl, "express", "Mohit@1987"); 
		            PreparedStatement ps = conn.prepareStatement(sqlStmt); 
		            ResultSet rs = ps.executeQuery();
				) {
					while (rs.next()) {
		                Employee emp = new Employee();
		                emp.setName(rs.getString(1));
		                
		                java.util.Date utDob = (java.util.Date) rs.getDate(2);
		                java.util.Date utDoj = (java.util.Date) rs.getDate(3);
		                java.util.Date utDom = (java.util.Date) rs.getDate(4);

		                SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		                emp.setDob(sdf2.format(utDob));

		                SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yy");
		                emp.setDoj(sdf1.format(utDoj));
		                
		                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
		                emp.setDom(sdf.format(utDom));

		                System.out.println(emp);
		            }
				} catch (SQLException e) {
					e.printStackTrace();
				}

	}

}

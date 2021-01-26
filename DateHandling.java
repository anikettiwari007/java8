import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class DateHandling{
	public static void main(String[] args) throws Exception{
		// Take input in different format of date
		//process them and save it
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter name of employee:");
		String name = sc.nextLine();
		System.out.println("Please enter date of birth(dd-MMM-yyyy):");
		String dob = sc.nextLine();
		System.out.println("Please enter date of joining(yyyy-MM-dd):");
		String doj = sc.nextLine();
		System.out.println("Please enter date of marriage(MMM-yyyy-dd):");
		String dom = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		java.util.Date utDob = sdf.parse(dob);
		long dobms = utDob.getTime();
		java.sql.Date sqDob = new java.sql.Date(dobms);

		java.sql.Date sqDoj = java.sql.Date.valueOf(doj);

		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM-yyyy-dd");
		java.util.Date utDom = sdf2.parse(dom);
		long msDom = utDom.getTime();
		java.sql.Date sqDom = new java.sql.Date(msDom);

		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlStmt = "insert into employee(name,dob,doj,dom) values(?,?,?,?)";
		String connectionUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl, "express", "Mohit@1987"); 
			PreparedStatement ps = conn.prepareStatement(sqlStmt); 
		) {
			ps.setString(1, name);
			ps.setDate(2, sqDob);
			ps.setDate(3, sqDoj);
			ps.setDate(4, sqDom);
			int i = ps.executeUpdate();
				if(i==0){
					System.out.println("Data is not inserted.");
				}
				else{
					System.out.println("Data inserted successfully.");
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}

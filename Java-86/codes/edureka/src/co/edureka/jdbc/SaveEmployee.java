package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "root");
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101, 'Sunil', 2500.50)";
		String sql = "insert into emp(empno, ename, sal) values (102, 'Anil', 2500.50),"
				+ "(103, ' Praveen', 7500),"
				+ "(104, 'Sanjay', 4575),"
				+ "(105, 'Sachin', 8550.75),"
				+ "(106, 'Bhaskar', 6500)";
		
		try {
			int rowsAffected = st.executeUpdate(sql);
			System.out.println("Employee Saved --> " + rowsAffected);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		st.close();
		con.close();
	}
}

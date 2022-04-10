package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from emp");
		
		while(rs.next()) {
			//System.out.println(rs.getInt(1)+" | " + rs.getString(2)+ " | " + rs.getFloat("sal"));
			String emp = String.format("%3d | %-10s | %.2f", rs.getInt(1), rs.getString(2), rs.getFloat("sal"));
			System.out.println(emp);
			Thread.sleep(2000);
		}
		
		rs.close();
		st.close();
		con.close();
	}

}

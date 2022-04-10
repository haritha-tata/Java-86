package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception{
		//-- Initialize JDBC Driver of MySQL
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- Connect to MySQL "edureka" Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "root");
		
		//-- Create a provision/ object for passing SQL Queries to connected DB
		Statement st = con.createStatement();
		
		String sql = "create table emp (empno int, ename varchar(30), sal float(10,2), primary key(empno))";
		
		//-- Pass SQL query to DB
		try {
			st.execute(sql);
			System.out.println("Database Table Created!!!");
		}catch(Exception ex) {
			System.out.println("Error --> " + ex.toString());
		}
		
		//-- Close connection with DB
		st.close();
		con.close();
	}
}

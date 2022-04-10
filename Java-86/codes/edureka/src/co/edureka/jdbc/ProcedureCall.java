package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		CallableStatement cst = con.prepareCall("{call hikeSalary1(?,?,?)}");
		
		int empno = 101;
		float hike = 10;
		
		cst.setInt(1, empno);
		cst.setFloat(2, hike);
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		
		System.out.println("Hiked Salary of Employee with Employee No: " + empno+" is Rs. " + cst.getFloat(3));
		
		cst.close();
		con.close();
	}
}

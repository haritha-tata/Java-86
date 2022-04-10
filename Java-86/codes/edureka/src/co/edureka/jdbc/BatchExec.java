package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(120, 'User-1', 2500)");
		st.addBatch("insert into emp values(121, 'User-2', 3500)");
		//st.addBatch("insert into emp values(121, 'User-2', 4500)");
		st.addBatch("insert into emp values(122, 'User-2', 4500)");
		st.addBatch("update emp set sal=5000");
		
		try {
			int[] rows = st.executeBatch();
			for(int i : rows)
				System.out.println("employees affected --> " + i);
			
			con.commit();
		}catch(Exception ex) {
			System.out.println(ex.toString());
			con.rollback();
		}
		
		st.close();
		con.close();
	}
}

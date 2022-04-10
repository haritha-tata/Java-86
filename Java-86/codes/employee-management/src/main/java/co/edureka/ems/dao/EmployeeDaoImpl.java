package co.edureka.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edureka.ems.configs.ConnectionFactory;
import co.edureka.ems.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Statement st;
	
	public EmployeeDaoImpl() throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		st = con.createStatement();
	}
	
	public Integer saveEmployee(Employee emp) throws Exception {
		String sql = "insert into emp values("+ emp.getEmpNo()+",'"+emp.getEmpName()+"',"
				+ emp.getEmpSalary()+")";
		Integer rowsInserted = st.executeUpdate(sql);
		return rowsInserted;
	}

	public Integer updateEmployee(Employee emp) throws Exception {
		String sql = "update emp set ename='"+emp.getEmpName()+"', sal="
				+ emp.getEmpSalary()+" where empno="+emp.getEmpNo();
		Integer rowsUpdated = st.executeUpdate(sql);
		return rowsUpdated;
	}

	public Integer deleteEmployee(Integer eno) throws Exception {
		String sql = "delete from emp where empno="+ eno;		
		return st.executeUpdate(sql);		
	}

	public Employee findEmployeeByNo(Integer eno) throws Exception {
		Employee emp = null;
		String sql = "select ename, sal from emp where empno = "+eno;
		
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {
			String name = rs.getString(1);
			Float sal = rs.getFloat(2);
			emp = new Employee(eno, name, sal);
		}
		return emp;
	}

	public List<Employee> findAllEmployees() throws Exception {
		List<Employee> emps = new ArrayList<Employee>();
		String sql = "select * from emp";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int empno = rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat(3);
			
			Employee emp = new Employee(empno, name, sal);
			emps.add(emp);
		}
		return emps;
	}
}

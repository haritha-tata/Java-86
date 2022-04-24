package co.edureka.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import co.edureka.ems.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate template) {
		this.jt = template;
	}

	public Integer saveEmployee(Employee emp) {
		String sql = "insert into emp values("+emp.getEmpNo()+",'"+emp.getEmpName()+"',"+emp.getEmpSal()+")";
		Integer rowsSaved = jt.update(sql);
		return rowsSaved;		
	}

	public Integer updateEmployee(Employee emp) {
		String sql = "update emp set ename='"+emp.getEmpName()+"', salary="+emp.getEmpSal()+" where empno="+emp.getEmpNo();
		Integer rowsUpdated = jt.update(sql);
		return rowsUpdated;
	}

	public Integer deleteEmployeeByEmpNo(Integer eno) {
		String sql = "delete from emp where empno="+eno;
		return jt.update(sql);
	}

	public Employee findEmployeeByEmpNo(final Integer eno) {
		Employee emp = null;
		
		String sql = "select ename, sal from emp where empno="+eno;
		
		emp = jt.queryForObject(sql, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				String name = rs.getString(1);
				float sal = rs.getFloat(2);
				Employee emp = new Employee(eno, name, sal);
				return emp;
			}
		}) ;
		
		return emp;
	}

	public List<Employee> findAllEmployees() {
		List<Employee> emps;
		
		String sql = "select * from emp";
		
		emps = jt.query(sql, new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list = new ArrayList<Employee>();
				
				while(rs.next()) {
					Integer eno = rs.getInt(1);
					String name=rs.getString(2);
					Float sal = rs.getFloat(3);
					
					Employee emp = new Employee(eno, name, sal);
					list.add(emp);
				}
				return list;
			}			
		});
		
		return emps;
	}

}

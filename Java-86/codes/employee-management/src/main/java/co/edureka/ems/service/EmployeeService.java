package co.edureka.ems.service;

import co.edureka.ems.dto.Employee;

public interface EmployeeService {
	void saveEmployee(Employee emp) throws Exception;
	void updateEmployee(Employee emp) throws Exception;
	void deleteEmployeeByNo(Integer eno) throws Exception;
	
	Employee searchEmployeeByNo(Integer eno) throws Exception;
	void getAllEmployees() throws Exception;
}

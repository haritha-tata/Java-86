package co.edureka.ems.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public Employee searchEmployeeByNo(Integer eno) {
		return dao.findEmployeeByEmpNo(eno);
	}
}

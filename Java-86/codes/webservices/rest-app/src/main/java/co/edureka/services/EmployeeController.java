package co.edureka.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edureka.bindings.Employee;

@Path("/employee")
public class EmployeeController {
	@GET
	@Path("/search/{id}")
	@Produces("application/json")
	public Employee findEmployeeById(@PathParam("id") Integer id) {
		//get Employee details from DB
		Employee emp = new Employee();
		emp.setEmpNo(id);
		emp.setEmpName("Sunil Joseph");
		emp.setEmpSal(2500.75f);
		
		return emp;
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees() 
	{
	   ArrayList<Employee> employeesList = new ArrayList<Employee>();
	    	     
	   employeesList.add(new Employee(101, "Sunil Joseph",2500f));
	   employeesList.add(new Employee(201, "Anirudh", 5250f));
	   employeesList.add(new Employee(301, "Jefferey", 7580.5f));	     
		    
	   return employeesList;
	}
}

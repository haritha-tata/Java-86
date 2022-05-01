package co.edureka.ems.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.entity.Employee;
import co.edureka.ems.service.EmployeeService;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeService service ;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");		
		service = (EmployeeService)context.getBean("employee-service");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer empno = Integer.parseInt(request.getParameter("eno"));
		Employee emp = service.searchEmployeeByNo(empno);
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		if(emp != null) {			
			String name = emp.getEmpName();
			float sal = emp.getEmpSal();
			
			JSONObject empJson = new JSONObject();
			empJson.put("empname", name);
			empJson.put("empsal", sal);
			
			out.println(empJson);
		}else {
			out.print("");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
}

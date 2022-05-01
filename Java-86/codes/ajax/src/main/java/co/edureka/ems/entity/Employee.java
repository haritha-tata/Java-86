package co.edureka.ems.entity;

public class Employee {
	private Integer empNo;
	private String empName;
	private Float empSal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(Integer empNo, String empName, Float empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSalary;
	}


	public Integer getEmpNo() {
		return empNo;
	}


	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Float getEmpSal() {
		return empSal;
	}


	public void setEmpSal(Float empSalary) {
		this.empSal = empSalary;
	}


	@Override
	public String toString() {
		String formattedEmployee = String.format("Employee[%-3d | %-12s | %.2f]", empNo, empName, empSal);
		return formattedEmployee;
	}
}

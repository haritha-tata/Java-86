package co.edureka.ems.dto;

public class Employee {
	private Integer empNo;
	private String empName;
	private Float empSalary;
	
	public Employee() {}

	public Employee(Integer empNo, String empName, Float empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
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

	public Float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		String emp = String.format("%3d | %-10s | %.2f", empNo, empName, empSalary);
		return emp;
	}
}

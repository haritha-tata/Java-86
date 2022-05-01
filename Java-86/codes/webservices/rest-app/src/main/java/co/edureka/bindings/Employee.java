package co.edureka.bindings;

import java.io.Serializable;

public class Employee implements Serializable{
	private Integer empNo;
	private String empName;
	private Float empSal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empNo, String empName, Float empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
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

	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}

}

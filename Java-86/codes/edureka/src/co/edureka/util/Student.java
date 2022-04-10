package co.edureka.util;

public class Student {

	private Integer studentId;
	private String studentName;
	
	public Student() {
	}
	
	public Student(Integer studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		String student = String.format("Student[%3d - %-8s]", studentId, studentName);
		return student;
	}	
}

package co.edureka.hibernate.entity;

import java.util.Set;

public class Faculty {
	private Integer facultyId;
	private String facultyName;
	private Set<Batch> batches;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(Integer facultyId, String facultyName) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Set<Batch> getBatches() {
		return batches;
	}

	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}
}

package co.edureka.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "EMPLOYEE")
/*
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
*/
@Data
public class Employee {
	@Id
	@Column(name = "EMP_ID")
	private Integer empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name="EMP_SAL")
	private Float empSalary;


}

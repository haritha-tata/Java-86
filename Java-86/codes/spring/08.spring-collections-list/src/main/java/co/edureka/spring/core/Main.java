package co.edureka.spring.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.Hospital;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");
		
		Hospital apollo = (Hospital)context.getBean("apollo");
		System.out.println("Hospital Name --> " + apollo.getHospitalName());
		
		List<String> depts = apollo.getDepartments();
		System.out.println(depts);
		System.out.println();
		
		System.out.println("Departments @ "+ apollo.getHospitalName()+"::");
		for(String dname : depts) {
			System.out.println("   ---> "+dname);
		}

	}

}

package co.edureka.hibernate;

import org.hibernate.Session;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SearchStudent2 {

	public static void main(String[] args) {
		Session session = HibernateUtils.getHibernateSession();
		
		//Student st = session.get(Student.class, 101);
		Student st = session.get(Student.class, 1015);
		
		if(st != null)
			System.out.println(st);
		else
			System.out.println("-- No matching Student found --");
		
		session.close();
	}
}

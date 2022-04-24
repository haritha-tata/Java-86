package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		Session session = HibernateUtils.getHibernateSession();
		
		Transaction tx = session.beginTransaction();
		
		/*
		Student st = new Student(101, "Sunil", "sunil@edureka.co", "9988776655");
		session.delete(st);
		*/
		
		Student st = session.get(Student.class, 110);
		if(st != null) {
			System.out.println(st);
			session.delete(st);
			//session.evict(st); //detached state
		}else {
			System.out.println("--- no matching student found ---");
		}
		
		tx.commit();
		session.close();

	}
}

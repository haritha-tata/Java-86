package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		Session session = HibernateUtils.getHibernateSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName='Anil'";
		String hql = "from co.edureka.hibernate.entity.Student where studentName like 'S%'";
		Query<Student> q = session.createQuery(hql, Student.class);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?1 and ?2"; //positional parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter(1, 101);
		q.setParameter(2, 106);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter("minsid", 105);
		q.setParameter("maxsid", 120);
		
		List<Student> students = q.getResultList();
		for(Student st : students) {
			System.out.println(st);
		}
		*/
		
		session.beginTransaction();
		String hql = "update co.edureka.hibernate.entity.Student set studentName='Sunil Joseph' where studentId=101";
		Query q = session.createQuery(hql);
		Integer rowsUpdated = q.executeUpdate();
		session.getTransaction().commit();
		
		System.out.println("Students Updated --> " + rowsUpdated);
		
		session.close();
	}
}

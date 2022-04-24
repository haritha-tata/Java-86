package co.edureka.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sfactory = null;
	
	public static Session getHibernateSession() {
		if(sfactory == null) {	
		 Configuration config = new Configuration();
		 config.configure("co/edureka/hibernate/configs/hibernate.cfg.xml"); //DOM Parser		
		 sfactory = config.buildSessionFactory();
		}
		
		Session session = sfactory.openSession();
		
		return session;
	}
}

package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user-car-beans.xml");
		
		User user = (User) context.getBean("user-sunil");
		//System.out.println(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+" owns a "+ user.getCar().getModel()+" car , "
				+ "which costs Rs."+user.getCar().getCost());
	}
}

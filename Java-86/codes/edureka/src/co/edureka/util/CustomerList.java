package co.edureka.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerList {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer cust1 = new Customer(1, "Praveen");
		Customer cust2 = new Customer(2, "Aravind");
		Customer cust3 = new Customer(3, "Sujith");
		
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		
		Iterator<Customer> it = customers.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println(c);
		}
	}

}

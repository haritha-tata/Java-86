package co.edureka.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		System.out.println(names.add("Praveen")); //true
		names.add("Sanjay");
		names.add("Anirudh");
		names.add("Bhaskar");
		
		System.out.println(names);		
	}

}

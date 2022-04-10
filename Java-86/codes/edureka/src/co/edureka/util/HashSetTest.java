package co.edureka.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		System.out.println(names.add("Praveen")); //true
		names.add("Sanjay");
		names.add("Anirudh");
		names.add("Bhaskar");
		
		System.out.println(names);
	}
}

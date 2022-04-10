package co.edureka.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) throws Exception {
		//ArrayList<String> names = new ArrayList<String>();
		List<String> names = new ArrayList<String>();
		System.out.println(names +" | Size="+ names.size());
		System.out.println("is the list empty --> " + names.isEmpty());
		
		names.add("Praveen");
		names.add("Sunil");
		names.add("Pankaj");
		names.add("Sachin");
		names.add("Sunil");
		names.add("Swapna");
		names.add("Charles");
		names.add("Sunil");
		
		System.out.println(names +" | Size="+ names.size());
		
		names.add(2, "Chris");
		System.out.println(names +" | Size="+ names.size());
		
		names.set(3, "PANKAJ");
		System.out.println(names +" | Size="+ names.size());
		
		System.out.println("is PANKAJ present --> " + names.contains("PANKAJ"));
		
		System.out.println("location of \"Sunil\" --> " + names.indexOf("Sunil"));
		
		System.out.println("last index \"Sunil\" --> " + names.lastIndexOf("Sunil"));
		
		System.out.println("first person is --> " + names.get(0));
		
		System.out.println(names.remove(0)); //Praveen
		System.out.println(names.remove("Sunil")); //true
		
		System.out.println(names +" | Size="+ names.size());
	}
}

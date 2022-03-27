package co.edureka.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(85,74,96,80,73,68,82,75);
		System.out.println(marks);
		
		iterate1(marks);
		iterate2(marks);
		iterate3(marks);
		iterate4(marks);
		iterate5(marks);
	}

	static void iterate1(List<Integer> marks) {
		System.out.println("<<< list iteration using for loop with get() method -- only for List ");
		for(int i=0;i<marks.size();i++) {
			Integer n = marks.get(i);
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}

	static void iterate2(List<Integer> marks) {
		System.out.println("<<< list iteration using enhanced for loop");
		for(Integer n : marks) {
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}
	
	static void iterate3(List<Integer> marks) {
		System.out.println("<<< list iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}
	
	static void iterate4(List<Integer> marks) {
		System.out.println("<<< list iteration using java.util.ListIterator - only for java.util.List");
		ListIterator<Integer> lit = marks.listIterator();
		
		while(lit.hasNext()) {
			Integer n = lit.next();
			System.out.print(n+"    ");
		}
		System.out.println();
		while(lit.hasPrevious()) {
			Integer n = lit.previous();
			System.out.print(n+"    ");
		}		
		System.out.println("\n");
	}	
	
	static void iterate5(List<Integer> marks) {
		System.out.println("<<< list iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}	
}

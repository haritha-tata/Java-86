package co.edureka.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentsCollection {

	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<Student>(new MyStudentComparator());
		
		Student st1 = new Student(261, "Praveen");
		Student st2 = new Student(193, "Sanjay");
		Student st3 = new Student(701, "Pankaj");
		Student st4 = new Student(372, "Charles");
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		
		//System.out.println(students);
		
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st);
		}
	}
}

class MyStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		//return -12;
		int n = o1.getStudentId() - o2.getStudentId();
		
		if(n < 0)
			return -1;
		else if(n > 0)
			return 1;
		else
			return 0;
	}	
}

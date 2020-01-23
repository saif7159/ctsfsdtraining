package com.example.comparator;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentMain {
public static void main(String[] args)
{
	Set<Student> students = new TreeSet<Student>();
	students.add(new Student("Dheeraj", 104, 5.9F));
	students.add(new Student("Saif", 101, 8.9F));
	students.add(new Student("Manu", 102, 7.5F));
	students.add(new Student("Arun", 103, 8.5F));
	/*for(Student student:students)
	{
	System.out.println(student);
	}*/
	Iterator<Student> itr = students.iterator();
	
}
}

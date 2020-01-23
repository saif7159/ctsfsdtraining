package com.multiple.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

import com.example.comparator.Student;

public class ComparatorMain {
public static void main(String[] args)
{
	Comparator c = new NameComparator();
	//c=new GradeComparator();
	Set<StudentDetail> stud = new TreeSet<StudentDetail>(c);
	stud.add(new StudentDetail("Dheeraj", 104, 5.9F));
	stud.add(new StudentDetail("Saif", 101, 8.9F));
	stud.add(new StudentDetail("Manu", 102, 7.5F));
	stud.add(new StudentDetail("Arun", 103, 8.5F));
	StudentDetail[] sd = (StudentDetail[]) stud.toArray();
	ArrayList<StudentDetail> list = (ArrayList<StudentDetail>) Arrays.asList(sd);
	Collections.reverse(list);
	Iterator<StudentDetail> i = stud.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	Iterator<StudentDetail> il = list.iterator();
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
	
}
}

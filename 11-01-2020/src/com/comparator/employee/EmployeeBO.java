package com.comparator.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeBO {
	static void printEmployees(List<Employee> l)
	{
		List<Employee> list;
		list =  l;
		Iterator<Employee> i = list.iterator();
		//System.out.format("%-15s %-30s %-30s %-10s %-10s\n", "Employee ID","Name","Department","Date of Joining","Age","Salary");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) throws ParseException, NumberFormatException, IOException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		List<Employee> emp = new ArrayList<Employee>();
		System.out.println("Input number of employees:");
		int size = Integer.parseInt(sc.readLine());
		for(int i =1;i<=size;i++) {
		System.out.println("Enter the details for Employee "+i);
		String name = sc.readLine();
		String department = sc.readLine();
		String date = sc.readLine();
		Date d = formatter.parse(date);
		int age = Integer.parseInt(sc.readLine());
		int salary = Integer.parseInt(sc.readLine());
		emp.add(new Employee(100+i, name, department, d, age, salary));
		}
		printEmployees(emp);
		System.out.println("Enter your choice:\n1. Sort employees by salary\n2. Sort employees by age and doj");
		int choice = Integer.parseInt(sc.readLine());
		switch(choice) {
		case 1:	Collections.sort(emp);
				printEmployees(emp);
				break;
		case 2: Comparator c1 = new AgeComparator();
				Collections.sort(emp,c1);
				printEmployees(emp);
				break;
		}

	}

}

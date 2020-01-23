package com.fileexample.writeobject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, NotSerializableException
{
	List<Employee> employee;
	EmployeeCreator ec = new EmployeeCreator();
	Scanner sc = new Scanner(System.in);
	FileInputStream fis = new FileInputStream("Employee");
	FileOutputStream fos = new FileOutputStream("Employee");
	ObjectOutputStream oos = new ObjectOutputStream(fos);;

	while(true) {
	System.out.println("Enter Choice\n1. Create Employee\n2. Display from employee file\n3. Exit");
	int choice = sc.nextInt();
	
	switch(choice)
	{
	case 1: System.out.println("Enter First Name, Last Name, Email");
			String firstname = sc.next();
			String lastname = sc.next();
			String email = sc.next();
			employee = ec.createEmployee(firstname, lastname, email);
			oos.writeObject(employee);
			break;
	case 2: System.out.println("Displaying...");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			List<Employee> empl = (List<Employee>) ois.readObject();
			Iterator<Employee> i = empl.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			break;
	case 3: oos.flush();
			oos.close();
			System.exit(0);		
			
	}}
}
}

package com.example.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class Tester {
public static void main(String[] args) throws NumberFormatException, IOException
{
	int choice = 0;
	Service s = new ServiceImpl();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	do {
		System.out.println("1. Create customer");
		System.out.println("2. Display all customers");
		System.out.println("3. Find customer by id");
		System.out.println("4. Update customer");
		System.out.println("5. Delete customer");
		System.out.println("0. Exit");
		System.out.print("choice:");

		choice = Integer.parseInt(br.readLine().toString());
		switch (choice) {
		case 1:
			System.out.print("First Name: ");
			String fName=br.readLine().toString();
			System.out.print("Last Name: ");
			String lName=br.readLine().toString();
			System.out.print("Email: ");
			String email=br.readLine().toString();
			Customer customer=s.createCustomer(fName, lName, email);
			System.out.println("Create Customer Sucess "+customer);
			break;
		case 2:
			System.out.println("Displaying Customer Details...");
			List<Customer> l = s.getAllCustomers();
			Iterator i = l.iterator();
			int count = 0;
			while(i.hasNext())
			{	
				count++;
				System.out.println("\nCustomer "+count+"\n"+i.next());
			}
			System.out.println("");
			break;
		case 3:
			System.out.println("Enter the customer id:");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Customer with id: "+id);
			System.out.println(s.findCustomerById(id));
			break;
		default:
			System.out.println("invalid choice");
			break;

		}
	} while (choice != 0);
	
}
}

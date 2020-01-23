package com.listexample.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;


public class Driver  {
public static void main(String[] args) throws IOException
{
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	Service s = new ServiceImplementation();
	String todoid = null;
	List<ToDo> list = null;
	//s.createToDo("To Do Task 1");
	//s.createToDo("To Do Task 2");
	//System.out.println(s.getAllToDo());
	//System.out.println(s.findById(todoid));
	while(true) {
	System.out.println("Enter choice:\n1. Create ToDo\n2. Show all ToDo\n3. Find ToDo\n4. Update by Task Id\n5. Remove By Id\n6. Remove All\n7. Exit");
	int choice = Integer.parseInt(sc.readLine());
	switch(choice)
	{
	 case 1: System.out.println("Enter task");
	         String task = sc.readLine();
	         s.createToDo(task);
	         break;

	 case 2: list = s.getAllToDo();
		  	 Iterator<ToDo> i = list.iterator();
	  		 while(i.hasNext())
	  		 {
		 	 System.out.println(i.next());
	  		 }
		 	 break;
	         
	 case 3: System.out.println("Enter task id");
	 		 todoid = sc.readLine();
	 		 System.out.println(s.findById(todoid));
             break;        
	
	 	 	
	 case 4:System.out.println("Enter task id");
	        String str = sc.readLine();
	        System.out.println("Enter task Name");
	        String str2 = sc.readLine();
	        s.updateById(str, str2);
	        System.out.println("Updated");
	        break;	
	        
	 case 5:System.out.println("Enter task id");
	        String str1 = sc.readLine();
	        s.removeById(str1);
	        System.out.println("Removing");
	        break;
	        
	 case 6:System.out.println("Clearing");
	 		s.removeAll();
	 		break;
	 		
	 case 7 :System.out.println("Exiting Application"); 
	 		System.exit(0);
		        
	 
	 default: break;	 	
	}}
}
}

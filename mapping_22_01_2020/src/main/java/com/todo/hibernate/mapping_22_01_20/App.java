package com.todo.hibernate.mapping_22_01_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.UUID;

import com.todo.hibernate.model.Task;
import com.todo.hibernate.model.ToDo;
import com.todo.hibernate.service.Service;
import com.todo.hibernate.service.ServiceImpl;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Service s = new ServiceImpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        do {
        	System.out.println("Enter choice\n1. Create todo\n2. Find todo by Id\n3. Update todo task\n4. Delete todo\n5. Show all todo\n6. Save and Exit DB Session");
        	int choice = Integer.parseInt(br.readLine());
        	switch(choice)
        	{
        	case 1: ToDo td = new ToDo();
        	 		Task task = new Task();
        			System.out.println("Enter author name");
        	 		String name = br.readLine();
        	 		String uid = UUID.randomUUID().toString();
        	 		LocalDateTime time = LocalDateTime.now();
        	 		System.out.println("Enter task name");
        	 		String tname = br.readLine();
        	 		task.setTaskname(tname);
        	 		task.setTaskuid(uid);
        	 		task.setCompleted(Boolean.FALSE);
        	 		td.setTodoauthor(name);
        	 		td.setNow(time);
        	 		td.setTask(task);
        	 		System.out.println(s.createToDo(td));
        	 		break;
        	case 2: System.out.println("Enter id");
        	 		int i = Integer.parseInt(br.readLine());
        	 		System.out.println(s.findById(i));
        	 		break;
        	 		
        	case 3: System.out.println("Enter id");
        	        int ui = Integer.parseInt(br.readLine());
        			System.out.println("Enter task name");
        	 		String taskname = br.readLine();
        	 		LocalDateTime utime = LocalDateTime.now();
        	 		System.out.println("Enter completion status Yes/No");
        	 		String c = br.readLine().toLowerCase();
        	 		boolean status = false;
        	 		if(c.equals("Yes")) {
        	 	    status = true;}
        	 		System.out.println(status);
        	 		Task task1 = new Task();
        	 		task1.setCompleted(status);
        	 		task1.setTaskname(taskname);
        	 		System.out.println(s.updateToDo(ui, utime, task1));
        	 		break;
        	case 4: System.out.println("Enter id:");
        	        int uuid = Integer.parseInt(br.readLine());
        	        s.deleteTodo(uuid);
        	        break;
        	case 5: System.out.println(s.getAllToDo());
        		 	break;
        	case 6: s.saveAndExit();	 	
        	        break;
        	}
        	
        	
        	
        }while(true);
      
        
        
        
    }
}

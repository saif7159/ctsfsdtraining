package com.object.comparision;

import java.time.LocalDate;
import java.util.UUID;

public class Driver {
public static void main(String[] args)
{//Creating objects for comparision
 TaskComp tc1 = new TaskComp(UUID.randomUUID().toString(), "Task Name Test", LocalDate.now(), true);
 TaskComp tc2 = new TaskComp(UUID.randomUUID().toString(), "Task Name Test", LocalDate.now(), true);
 System.out.println(tc1);//calling overridden toString
 System.out.println(tc2);
 System.out.println(tc1.equals(tc2));
 
}
}

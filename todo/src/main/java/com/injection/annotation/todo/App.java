package com.injection.annotation.todo;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ToDo todo = context.getBean("toDo", ToDo.class);
        todo.setTodoid(UUID.randomUUID().toString());
        todo.setTododate(LocalDate.now());
        System.out.println(todo);
    }
}

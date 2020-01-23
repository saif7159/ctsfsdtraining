package com.example.springhibernate_23_01_2020;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService s = context.getBean("service", ServiceImpl.class);
        s.createUser(new UserDetail(UUID.randomUUID().toString(),"Manu","manu.24mar@gmail.com"));
        
    }
}

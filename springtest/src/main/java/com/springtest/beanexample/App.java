package com.springtest.beanexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtest.beanpool.Employee;

public class App 
{
    public static void main( String[] args )
    {
        try {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee e = context.getBean("myEmployee", Employee.class);
        Employee e1 = context.getBean("myEmployee", Employee.class);
        System.out.println(e==e1);
        System.out.println(e.getDetails());
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        }
}

package com.springtest.beanpool;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
private int empid;
private String empname;
private Address a;
public String getDetails()
{
	String details = null;
	//ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	//Address myAddress = context.getBean("myAddress",Address.class);
	details = "ID: "+empid+"\nEmployee Name: "+empname+"\nAddress: "+a.getLine1()+"\n"+a.getLine2()+"\n"+a.getZipcode();
	return details;
}
}

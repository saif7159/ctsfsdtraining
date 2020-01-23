package com.example.SetTest;

import java.util.Set;

public class Tester {
public static void main(String[] args)
{
	Service service = new Service();
	service.addCustomer(101, "Saif", "Haque", "abc@gmail.com");
	service.addCustomer(101, "Saif", "Haque", "abc@gmail.com");
	Set<Customer> s = service.getAllCustomer();
	System.out.println(s);

}
}

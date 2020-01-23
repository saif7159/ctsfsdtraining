package com.example.SetTest;

import java.util.Set;

public class Service {
CustomerDao custDao = null;
{
custDao = new CustomerDao();	
}
public void addCustomer(int cust_id,String first_name,String last_name,String email)
{
	custDao.createCustomer(cust_id, first_name, last_name, email);
}
public Set<Customer> getAllCustomer()
{
	return custDao.getAllCustomer();
}
}

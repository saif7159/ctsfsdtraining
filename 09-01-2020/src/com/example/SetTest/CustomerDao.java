package com.example.SetTest;

import java.util.HashSet;
import java.util.Set;

//Class to create data set of type customer
public class CustomerDao {
private Set<Customer> customerSet = null;
{
	customerSet = new HashSet<Customer>();
}
public void createCustomer(int cust_id,String first_name,String last_name,String email)
{
	customerSet.add(new Customer(cust_id, first_name, last_name, email));
}
public Set<Customer> getAllCustomer()
{
	return customerSet;
}
}

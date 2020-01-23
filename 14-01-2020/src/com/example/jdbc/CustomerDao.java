package com.example.jdbc;

import java.util.List;

public interface CustomerDao {
public Customer createCustomer(String firstname, String lastname, String email);
public List<Customer> getAllCustomer();
public Customer findCustomerById(int id);
public void updateCustomer(int id, String name, String lastname, String email);
public void deleteCustomer(int id);

}

package com.example.jdbc;

import java.util.List;

public interface Service {
public Customer createCustomer(String firstname, String lastname, String email);
public List<Customer> getAllCustomers();
public Customer findCustomerById(int id);
}

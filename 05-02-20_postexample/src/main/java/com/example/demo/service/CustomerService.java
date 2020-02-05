package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Customer;

public interface CustomerService {
public List<Customer> getCustomer();
public Optional<Customer> findById(int id);
public Customer createCustomer(Customer customer);
public void deleteCustomer(int id);
public void deleteAll();
public List<Customer> findByName(String name);
public List<Customer> findByNameOrEmail(String name,String email);
public void deleteByName(String name);
}

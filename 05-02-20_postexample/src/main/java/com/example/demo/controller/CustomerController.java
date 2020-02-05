package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/")
public class CustomerController {
private CustomerService cs;
@Autowired
public CustomerController(CustomerService cs) {
	super();
	this.cs = cs;
}
@GetMapping("/customers")
public List<Customer> getAllCustomer()
{
	return cs.getCustomer();
}
@GetMapping("/customers/{cid}")
public Optional<Customer> findById(@PathVariable Integer cid)
{
	return cs.findById(cid);
}
@PostMapping("/customers")
public Customer createCustomer(@RequestBody Customer customer)
{
	customer.setCid(0);
	return cs.createCustomer(customer);
}
@PutMapping("/customers")
public Customer updateCustomer(@RequestBody Customer customer)
{
	return cs.createCustomer(customer);
}
@DeleteMapping("/customers/{cid}")
public void deleteCustomer(@PathVariable Integer cid)
{
	cs.deleteCustomer(cid);
}
@DeleteMapping("/customers")
public void deleteAll()
{
	cs.deleteAll();
}
@GetMapping("/customersName/{name}")
public List<Customer> findById(@PathVariable String name)
{
	return cs.findByName(name);
}
@GetMapping("/customersNameEmail/{name}/{email}")
public List<Customer> findById(@PathVariable String name, @PathVariable String email )
{
	return cs.findByNameOrEmail(name, email);
}
@DeleteMapping("/customersName/{name}")
public void deleteByName(@PathVariable String name)
{
	cs.deleteByName(name);
}
}

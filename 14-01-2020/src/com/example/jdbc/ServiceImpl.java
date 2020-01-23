package com.example.jdbc;

import java.util.List;

public class ServiceImpl implements Service {
	CustomerDao custdao = null;
	{
		custdao = new CustomerDaoImpl();
	}
	@Override
	public Customer createCustomer(String firstname, String lastname, String email) {
		return custdao.createCustomer(firstname, lastname, email);
	}
	@Override
	public List<Customer> getAllCustomers() {
		
		return custdao.getAllCustomer();
	}
	@Override
	public Customer findCustomerById(int id) {
		
		return custdao.findCustomerById(id);
	}

}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.CustDao;
import com.example.demo.model.Customer;
@Service
@EnableTransactionManagement
public class CustomerServiceImpl implements CustomerService {
	
	private CustDao cdao;
	@Autowired
	public CustomerServiceImpl(CustDao cdao) {
		super();
		this.cdao = cdao;
	}

	@Override
	public List<Customer> getCustomer() {
		
		return cdao.findAll();
	}

	@Override
	public Optional<Customer> findById(int id) {
		
		return cdao.findById(id);
	}

	@Override
	public Customer createCustomer(Customer customer) {
	
		cdao.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		cdao.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		
		cdao.deleteAll();
	}

	@Override
	public List<Customer> findByName(String name) {
		
		return cdao.findByName(name);
	}

	@Override
	public List<Customer> findByNameOrEmail(String name, String email) {
		
		return cdao.findByNameOrEmail(name, email);
	}


}

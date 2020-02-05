package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.CarsDao;
import com.example.demo.model.Cars;
@Service
@EnableTransactionManagement
public class CarsServiceImpl implements CarsService {
CarsDao cdao;

	@Autowired
	public CarsServiceImpl(CarsDao cdao) {
	super();
	this.cdao = cdao;
}

	@Override
	public List<Cars> getAllCars() {
	
		return cdao.findAll();
	}

	@Override
	public Optional<Cars> findById(int id) {
	
		return cdao.findById(id);
	}

}

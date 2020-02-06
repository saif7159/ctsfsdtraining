package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ItemsDao;
import com.example.demo.model.Items;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemsDao idao;
	@Override
	@Transactional
	public List<Items> getAllItems() {
		
		return idao.findAll();
	}

	@Override
	@Transactional
	public Items createItems(Items item) {
		
		return idao.insert(item);
	}

	@Override
	public Optional<Items> findById(Integer id) {
	
		return idao.findById(id);
	}

	@Override
	public List<Items> findByName(String name) {
	
		return idao.findByName(name);
	}

	@Override
	public void deleteById(Integer id) {
		idao.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		idao.deleteAll();
		
	}



}

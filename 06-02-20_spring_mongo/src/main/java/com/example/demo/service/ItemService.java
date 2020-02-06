package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Items;

public interface ItemService {
public List<Items> getAllItems();
public Items createItems(Items item);
public Optional<Items> findById(Integer id);
public List<Items> findByName(String name);
public List<Items> findByNameAndId(String name,Integer id);
public void deleteById(Integer id);
public void deleteAll();
}

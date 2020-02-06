package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Items;

public interface ItemService {
public List<Items> getAllItems();
public Items createItems(Items item);
public Items findByIsbn(Integer isbn);
public List<Items> findByName(String name);
public List<Items> findByNameAndIsbn(String name,Integer isbn);
public List<Items> findByNameOrIsbn(String name,Integer isbn);
public Items updateItem(Items item);
public void deleteByIsbn(Integer isbn);
public void deleteAll();
}

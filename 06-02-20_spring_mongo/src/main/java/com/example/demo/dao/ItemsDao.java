package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Items;
@Repository
public interface ItemsDao extends MongoRepository<Items, Integer> {
public Items findByIsbn(Integer isbn);
public List<Items> findByName(String name);
public List<Items> findByNameAndIsbn(String name,Integer isbn);
public List<Items> findByNameOrIsbn(String name,Integer isbn);
public void deleteByIsbn(Integer isbn);

}

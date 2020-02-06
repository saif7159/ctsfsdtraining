package com.example.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Items;
@Repository
public interface ItemsDao extends MongoRepository<Items, Integer> {
public List<Items> findByName(String name);
public List<Items> findByNameAndId(String name,Integer id);

}

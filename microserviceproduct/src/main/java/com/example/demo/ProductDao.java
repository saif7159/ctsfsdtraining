package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductDao extends MongoRepository<Product, String> {

}

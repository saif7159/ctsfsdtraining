package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productapi")
public class ProductController {
@Autowired
ProductDao dao;
@PostMapping("/create")
public Product createProduct(@RequestBody Product product)
{
	return dao.insert(product);
}
@GetMapping("/all")
public ResponseEntity<?> getProducts()
{
	return ResponseEntity.ok(dao.findAll());
}
}

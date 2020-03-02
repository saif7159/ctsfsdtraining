package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Product {
private int pid;
private String name;
private int quantity;
}

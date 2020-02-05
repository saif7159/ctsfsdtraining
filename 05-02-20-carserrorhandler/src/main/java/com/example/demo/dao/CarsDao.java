package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cars;

public interface CarsDao extends JpaRepository<Cars, Integer> {

}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Cars;

public interface CarsService {
public List<Cars> getAllCars();
public Optional<Cars> findById(int id);
}

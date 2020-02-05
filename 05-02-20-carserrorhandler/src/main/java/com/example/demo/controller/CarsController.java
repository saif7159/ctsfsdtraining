package com.example.demo.controller;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.CarNotFoundException;
import com.example.demo.error.ErrorMessage;
import com.example.demo.model.Cars;
import com.example.demo.service.CarsService;

@RestController
@RequestMapping("/")
public class CarsController {
CarsService cs;
@Autowired
public CarsController(CarsService cs) {
	super();
	this.cs = cs;
}
@ExceptionHandler
public ResponseEntity<ErrorMessage> handleErrorOne(CarNotFoundException cne)
{	ErrorMessage em = new ErrorMessage();
	em.setErrorTime(System.currentTimeMillis());
	em.setMessage(cne.getMessage());
	em.setStatus(HttpStatus.NOT_FOUND.value());
	return new ResponseEntity<>(em,HttpStatus.NOT_FOUND);
}
@ExceptionHandler
public ResponseEntity<ErrorMessage> handleErrorTwo(Exception e)
{	ErrorMessage em = new ErrorMessage();
	em.setErrorTime(System.currentTimeMillis());
	em.setMessage(e.getMessage());
	em.setStatus(HttpStatus.BAD_REQUEST.value());
	return new ResponseEntity<>(em,HttpStatus.BAD_REQUEST);
}
@GetMapping("/cars")
public List<Cars> getAllCars()
{
	return cs.getAllCars();
}
@GetMapping("/cars/{carid}")
public Optional<Cars> findById(@PathVariable Integer carid)
{	Optional<Cars> cars = cs.findById(carid);
	if(!cars.isPresent())
	{
		throw new CarNotFoundException("Incorrect ID: "+carid);
	}
	return cars;
}
}

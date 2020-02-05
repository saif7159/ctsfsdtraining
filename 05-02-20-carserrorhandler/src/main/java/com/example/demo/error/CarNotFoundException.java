package com.example.demo.error;

import lombok.Getter;

@Getter
@SuppressWarnings("serial")
public class CarNotFoundException extends RuntimeException {
	String message;
	public CarNotFoundException(String message) {
		super(message);
		this.message = message;
	}

 
}

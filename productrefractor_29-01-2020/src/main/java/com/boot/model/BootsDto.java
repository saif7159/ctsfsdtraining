package com.boot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BootsDto {
	
	private String brand;
	private String name;
	private int size;
	private String email;
	private String uid;
}

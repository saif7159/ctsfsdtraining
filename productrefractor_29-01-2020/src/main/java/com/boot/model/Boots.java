package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor

@Getter
@Setter
@ToString
@Entity
public class Boots {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String brand;
private String name;
private int size;
@Column(name = "SELLER_EMAIL")
private String email;
private String uid;
public Boots(String brand, String name, int size, String email) {
	super();
	this.brand = brand;
	this.name = name;
	this.size = size;
	this.email = email;
}

}

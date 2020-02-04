package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Getter
@Setter
public class Player {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int age;
private String sport;
//@OneToMany(mappedBy = "player")
//private List<Titles> titles;
}

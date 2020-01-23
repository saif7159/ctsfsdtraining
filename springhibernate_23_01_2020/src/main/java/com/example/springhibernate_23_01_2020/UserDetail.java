package com.example.springhibernate_23_01_2020;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "USERDETAIL")
public class UserDetail {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String uid;
@Length(min = 5, max = 8)
private String name;
@Email(message = "Invalid Email")
private String email;
public UserDetail(String uid, String name, String email) {
	super();
	this.uid = uid;
	this.name = name;
	this.email = email;
}
@Override
public String toString() {
	return "UserDetail [id=" + id + ", uid=" + uid + ", name=" + name + ", email=" + email + "]";
}

}

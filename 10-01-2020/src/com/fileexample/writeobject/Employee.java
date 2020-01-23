package com.fileexample.writeobject;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class Employee implements Serializable {
private String firstname;
private String lastname;
private String email;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "First Name: "+getFirstname()+" Last Name: "+getLastname()+" Email: "+getEmail();
}

}

package com.multiple.comparator;



import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDetail {
String name;
int id;
float cgpa;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Name: "+getName()+" ID: "+getId()+" CGPA: "+getCgpa();
}

}

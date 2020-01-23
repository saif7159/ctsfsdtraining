package com.example.comparator;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student implements Comparable<Student> {
String name;
int id;
float cgpa;
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	int result=0;
	if(this.cgpa>o.cgpa)
	{
		result = -1;
	}
	else if(this.cgpa<o.cgpa)
	{
		result = 1;
	}
	else
	{
		result = 0;
	}
	return result;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Name: "+getName()+" ID: "+getId()+" CGPA: "+getCgpa();
}

}

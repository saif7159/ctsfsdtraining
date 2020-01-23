package com.fileexample.writeobject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCreator {
List<Employee> employee;

{
	employee= new ArrayList<Employee>();

}
List<Employee> createEmployee(String firstname, String lastname, String email)
{
	employee.add(new Employee(firstname, lastname, email));	
	return employee;
	
}

}

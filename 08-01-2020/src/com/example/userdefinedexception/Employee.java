package com.example.userdefinedexception;

public class Employee {
private Integer emp_id;
private String emp_name;
private String emp_address;
private double experience;
private String hirestatus;
public Employee(Integer emp_id, String emp_name, String emp_address, double experience) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.emp_address = emp_address;
	this.experience = experience;
}
public void createEmployee() throws HireExperienceException
{
 
 if(experience<2)
 {
	 throw new HireExperienceException("Employee cannot be hired");
 }
 else
 {
  hirestatus = "Congratulations you are eligible for hiring";
 }
 
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return hirestatus+"\nEmployee ID: "+emp_id+"\nEmployee Name: "+emp_name+"\nEmployee Address: "+emp_address;
}
@Override
public boolean equals(Object obj) 
{
	// TODO Auto-generated method stub
	Employee e = null;
	boolean result = false;
	if(obj instanceof Employee)
	{
		e = (Employee) obj;
	}
	if(this.emp_address.equals(e.emp_address)||this.emp_name.equals(e.emp_name))
	{
		result = true;
		
		}
	return result;
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}


}

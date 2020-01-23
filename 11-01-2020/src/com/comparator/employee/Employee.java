package com.comparator.employee;

import java.util.Date;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	public Employee(int id, String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		
		int result = 0;
		if(this.getSalary()>e.getSalary())
		{
			result = 1;
		}
		else if(this.getSalary()<e.getSalary())
		{
			result = -1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	@Override
	public String toString() {
		/*return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", dateOfJoining="
				+ dateOfJoining + ", age=" + age + ", salary=" + salary + "]";*/
		System.out.format("%-15s%-30s%-30s%-20s%-10s%-10s\n",id,name,department,dateOfJoining,age,salary);
		return "";
	}
	
	

}

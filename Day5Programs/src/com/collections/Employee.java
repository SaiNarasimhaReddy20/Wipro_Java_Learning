package com.collections;

public class Employee {

	private int id;
	private String name;
	private String designation;
	
	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	public Employee(){
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "Employee [ EmployeeID=" + id + ", EmployeeNAME=" + name + ", EmployeeDESIGNATION=" + designation + "]";
	}
	
}

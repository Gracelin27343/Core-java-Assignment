package com.gracelin.assignment.employee;

public class Employee {
	//private  attributes
     private String name;
     private int employeeId;
     private double salary;
     
     //construct
	public Employee(String name, int employeeId, double salary2) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary2;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double d) {
		this.salary = (int) d;
	}}
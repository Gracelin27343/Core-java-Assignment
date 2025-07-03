package com.gracelin.assignment.employee;

//developer as employee

public class Developer extends Employee {
    private String Programmer;
	public Developer(String name, int employeeId, double salary, String Programmer) {
		super(name, employeeId, salary);
		this.Programmer = Programmer;
	}
	public String getProgrammer() {
		return Programmer;
	}
	public void setProgrammer(String programmer) {
		this.Programmer = programmer;
	}

}
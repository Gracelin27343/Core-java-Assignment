package com.gracelin.assignment.employee;

//manager as employee
public class Manager extends Employee {
     private int teamsize;
	 public Manager(String name, int string, int salary, int teamsize) {
			super(name, string, salary);
			this.teamsize=teamsize;
		}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
}
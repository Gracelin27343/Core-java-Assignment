package com.gracelin.assignment2;

public class Student {

	public Student() {
		System.out.println("student oject id created");
	}

	  String name;
	  String address;
	  int phone;
	   double salesAmount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public double getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + ", salesAmount=" + salesAmount
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ ", getSalesAmount()=" + getSalesAmount() + "]";
	}
	  
	
	  
}

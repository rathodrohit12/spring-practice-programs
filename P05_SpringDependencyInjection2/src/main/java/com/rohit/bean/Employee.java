package com.rohit.bean;

public class Employee {
	private String name;
	private int age;
	private Address adr;
	
	public Employee()
	{
		System.out.println("Employee constructor....");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", adr=" + (Address)adr + "]";
	}

}

package com.rohit.bean;

import lombok.Data;

@Data
public class Employee {
	private String name;
	private int age;
	private Address address;
	
	static {
		System.out.println("Employee class loaded...");
	}
	
	public Employee() {
		System.out.println("Employee No Argument Constructor...");
	}
	
	
	public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("Employee Parameterized Constructor...");
    }
	
	public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Employee name and age Constructor...");
    }
	
	public void myInit() {
		System.out.println("Employee myinit method...");
	}
	
	public void myDestroy() {
		System.out.println("Employee myDestroy method...");
	}
	
	
	
	
	
}

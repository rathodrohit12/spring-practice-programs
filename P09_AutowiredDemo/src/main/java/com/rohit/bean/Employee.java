package com.rohit.bean;

import lombok.Data;

@Data
public class Employee {

	private int age;
	private String name;

	Employee() {
		System.out.println("this is default constructor");
	}

	Employee(int age) {
		this.age = age;
		System.out.println("this is integer constructor");
	}

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("this is 2 constructor");
	}

}

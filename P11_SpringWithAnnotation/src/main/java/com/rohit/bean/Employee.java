package com.rohit.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@Component(value = "emp")
@Data
public class Employee {
	private String name;
	private int age;
	
	@Autowired
	private Address address;

	static {
		System.out.println("Employee class loaded..");
	}

	public Employee() {
		System.out.println("Employee No arg const...");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("Employee init method..");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("Employee myDestroy method..");
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Employee two arg const..");

	}

	

}

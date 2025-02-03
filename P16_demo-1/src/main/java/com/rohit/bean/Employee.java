package com.rohit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data

@Component(value = "emp")
public class Employee {
	
	@Value("101")
	private int id;
	
	@Value("Rohit")
	private String name;
	
	@Value("50000")
	private double salary;
	
	@Autowired
	private Address address;
	
	public Employee() {
		System.out.println("Employee const...");
	}
	
	

}

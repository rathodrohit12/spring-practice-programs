package com.rohit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

@Component(value = "emp")
public class Employee {
	@Value("Ravi")
	private String name;
	
	@Value("22")
	private int age;
	
	@Autowired
	private Address address;


	

}

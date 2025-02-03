package com.rohit.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Component(value = "adr")
public class Address {
	private String city, state, country;

	static {
		System.out.println("Address class loaded..");
	}

	public Address() {
		System.out.println("Address No arg const...");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("Address init method..");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("Address myDestroy method..");
	}
}

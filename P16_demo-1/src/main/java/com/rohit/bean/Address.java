package com.rohit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component(value = "adr")
public class Address {
	@Value("pune")
	private String city;
	
	@Value("mh")
	private String state;
	
	@Value("India")
	private String country;
	
	public Address() {
		System.out.println("Address const...");
	}

}

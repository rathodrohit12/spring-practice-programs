package com.rohit.bean;

import lombok.Data;

@Data
public class Address {
	private String city, state, country;
	
	static {
		System.out.println("Address class loaded...");
	}
	
	public Address() {
		System.out.println("Address No Argument Constructor...");
	}
	public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
        System.out.println("Address Parameterized Constructor...");
    }
	
	public void myInit() {
		System.out.println("Address myinit method...");
	}
	
	public void myDestroy() {
		System.out.println("Address myDestroy method...");
	}
}

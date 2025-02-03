package com.rohit.bulb;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("lgObj")
public class LgBulb implements Bulb{

	@Override
	public String getBulb() {
		return "LgBulb";
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("LgBulb init...");
	}
	
	@PreDestroy
	public void myDestoy() {
		System.out.println("LgBulb destroy...");

	}

}

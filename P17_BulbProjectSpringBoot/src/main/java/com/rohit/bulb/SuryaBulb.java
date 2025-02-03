package com.rohit.bulb;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("suryaObj")
@Primary
public class SuryaBulb implements Bulb {

	@Override
	public String getBulb() {
		return "SuryaBulb";
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("SuryaBulb init...");
	}
	
	@PreDestroy
	public void myDestoy() {
		System.out.println("SuryaBulb destroy...");

	}

}

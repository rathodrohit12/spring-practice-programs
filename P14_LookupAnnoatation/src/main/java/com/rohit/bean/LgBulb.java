package com.rohit.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "lgObj")
//@Primary
@Scope("prototype")
public class LgBulb implements Bulb {
	public LgBulb() {
		System.out.println("Lg Cons");
	}

	public String getBulb() {
		return "LgBulb";
	}

}
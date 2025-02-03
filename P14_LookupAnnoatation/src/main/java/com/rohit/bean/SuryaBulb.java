package com.rohit.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "suryaObj")
@Lazy(value = false)
public class SuryaBulb implements Bulb {
	public SuryaBulb() {
		System.out.println("SuryaBulb Cons");
	}

	public String getBulb() {
		return "surya bulb";
	}
}
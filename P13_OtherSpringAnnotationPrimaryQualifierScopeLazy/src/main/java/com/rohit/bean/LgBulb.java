package com.rohit.bean;

import org.springframework.stereotype.Component;

@Component
public class LgBulb implements Bulb{

	@Override
	public String getBulb() {
		return "Lg bulb";
	}

}

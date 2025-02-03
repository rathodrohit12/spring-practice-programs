package com.rohit.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuryaBulb implements Bulb{

	@Override
	public String getBulb() {
		return "surya bulb";
	}

}

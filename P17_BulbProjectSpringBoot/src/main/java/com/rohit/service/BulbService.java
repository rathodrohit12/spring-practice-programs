package com.rohit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rohit.bulb.Bulb;

@Service
public class BulbService {

	Bulb bulb;
	
	public BulbService( Bulb bulb) {
		this.bulb = bulb;
		System.out.println("Service constructor...");
	}
	
	@Autowired
	@Qualifier("suryaObj")
	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}

	public String askBulb() {
		return bulb.getBulb();

	}

}

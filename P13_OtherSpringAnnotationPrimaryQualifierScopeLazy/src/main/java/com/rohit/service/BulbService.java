package com.rohit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rohit.bean.Bulb;

@Service
public class BulbService {

	//@Autowired
	@Qualifier(value = "suryaBulb")       // qualifier override primary
	Bulb bulb;
	
//	@Autowired                               // prefer autowired on setter insted on ref var
//	public void setBulb(Bulb bulb) {
//		this.bulb = bulb;
//	}
//	
	public BulbService(Bulb bulb) {
		super();
		this.bulb = bulb;
	}



	public String askBulb() {
		return bulb.getBulb();
	}

}

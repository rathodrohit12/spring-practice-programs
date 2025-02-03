package com.rohit.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.rohit.bean.Bulb;

@Service
@Scope("singleton")
public class BulbService 
{
    
	private Bulb bulb; 
    
    public BulbService(Bulb bulb)
    {
		this.bulb=bulb;
    	System.out.println("BulbService cons..");
    }
    
	public Bulb getBulb() {
		return bulb;
	}

	
	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}

	public String askBulb(){
		return bulb.getBulb();
	}
	
}

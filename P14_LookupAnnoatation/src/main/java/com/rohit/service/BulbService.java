package com.rohit.service;


import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.rohit.bean.Bulb;

@Service
@Scope("singleton")
public class BulbService {
    
    public BulbService(){
    	System.out.println("BulbService cons..");
    }
   
     
    @Lookup(value ="lgObj" )
	public Bulb getBulb() {
		return null;
	}

	
 
	 
	
	
}

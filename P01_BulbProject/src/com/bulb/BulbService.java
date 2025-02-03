package com.bulb;

public class BulbService {
	Bulb bulb=new LgBulb();
	
	public String askBulb(){
     return bulb.getBulb();		
	}

}

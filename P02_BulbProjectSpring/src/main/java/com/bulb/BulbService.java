package com.bulb;

public class BulbService 
{
	Bulb bulb;

	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}


	public String askBulb()
	{
     return bulb.getBulb();		
	}

}

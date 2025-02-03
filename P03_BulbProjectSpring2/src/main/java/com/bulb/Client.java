package com.bulb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
 
		 ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		 BulbService b1 = (BulbService)applicationContext.getBean("bbObj");
		 BulbService b2 = (BulbService)applicationContext.getBean("bbObj");
		 System.out.println(b1);
		 System.out.println(b2);
	
		 /*
		  * b1 and b2 ref id are same i.e. singleton object
		  * to create prototype object use scope="prototype" in .xml 
		  */

	}

}

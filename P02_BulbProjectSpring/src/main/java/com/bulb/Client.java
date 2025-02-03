package com.bulb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
 
		 ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		 BulbService b = (BulbService)applicationContext.getBean("bbObj");
		 System.out.println(b.askBulb());
	}

}

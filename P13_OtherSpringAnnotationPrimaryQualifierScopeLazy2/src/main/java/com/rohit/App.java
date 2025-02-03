package com.rohit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.bean.LgBulb;
import com.rohit.config.AppConfig;
import com.rohit.service.BulbService;

/*
 * 
 * in singleton bean we autowired protype bean then prototype behave as singleton
 */


public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfig = new AnnotationConfigApplicationContext(AppConfig.class);

		BulbService b = (BulbService) annotationConfig.getBean("bulbService");
		System.out.println(b);

		BulbService b1 = (BulbService) annotationConfig.getBean("bulbService");
		System.out.println(b1);

		LgBulb bulb1 = (LgBulb) b1.getBulb();
		System.out.println(bulb1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LgBulb bulb2 = (LgBulb) b1.getBulb();

		System.out.println(bulb2);

//  	  
//  	   Bulb bulb = (Bulb)annotationConfig.getBean("lgObj");
//  	   System.out.println(bulb)
		;
//  	   
//  	   try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//  	   
//  	   Bulb bb = (Bulb)annotationConfig.getBean("lgObj");
//  	   System.out.println(bb);

		annotationConfig.close();

	}
}

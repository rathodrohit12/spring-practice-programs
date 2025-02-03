package com.rohit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.config.AppConfig;
import com.rohit.service.BulbService;

public class App {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfig = new AnnotationConfigApplicationContext(AppConfig.class);

		BulbService b = (BulbService) annotationConfig.getBean("bulbService");
		System.out.println(b);
	}
	
	
}

package com.rohit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.config.AppConfig;
import com.rohit.service.BulbService;

public class App {
    public static void main( String[] args ){
        
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	BulbService bulbService = (BulbService)context.getBean("bulbService");
    	//BulbService bulbService = (BulbService)context.getBean("BulbService.class");
    	System.out.println(bulbService.askBulb());
    }
}

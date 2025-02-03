package com.rohit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.rohit.service.BulbService;

@SpringBootApplication
public class BulbProjectSpringBootApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = (AbstractApplicationContext)SpringApplication.run(BulbProjectSpringBootApplication.class, args);
		BulbService bulbService = context.getBean("bulbService", BulbService.class);
		
		System.out.println(bulbService.askBulb());
		
		context.registerShutdownHook();
	
	}

}

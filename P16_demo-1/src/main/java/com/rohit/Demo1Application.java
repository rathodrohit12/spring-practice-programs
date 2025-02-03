package com.rohit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.rohit.bean.Employee;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext)SpringApplication.run(Demo1Application.class, args);
		
		Employee employee = context.getBean("emp", Employee.class);
		
		System.out.println(employee);
		//System.out.println("hello");
		
		
		
	}

}

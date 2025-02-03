package com.rohit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.rohit.bean.Address;
import com.rohit.bean.Employee;
import com.rohit.config.AppConfig;

public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Address address = context.getBean("adr", Address.class);
		address.setCity("pune");
		address.setState("mh");
		address.setCountry("India");
		
		
		Employee employee = (Employee) context.getBean("emp");
		employee.setName("ABC");
		employee.setAge(22);
	//	employee.setAddress(address);
		
		

		System.out.println(address);
		System.out.println(employee);

		context.registerShutdownHook();

	}
}

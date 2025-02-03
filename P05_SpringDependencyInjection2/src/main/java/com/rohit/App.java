package com.rohit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.bean.Employee;

public class App {
	public static void main(String[] args) {

		// Resource resource=new ClassPathResource("applicationContext.xml");
		// BeanFactory factory=new XmlBeanFactory(resource);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		applicationContext.getBean("adr");
//		applicationContext.getBean("emp");
		
		
		
//		Employee emp = (Employee) applicationContext.getBean("emp");
//		System.out.println(emp);
		
		/*
		 * ApplicationContext by default do eager loading
		 * if lazy=true then constructor run when we use getter method i.e. getBean()
		 */

	}

}

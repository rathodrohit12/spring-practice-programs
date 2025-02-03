package com.rohit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.bean.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowireByName.xml");
		Employee emp = (Employee) applicationContext.getBean("emp");
		System.out.println(emp);
	}
}

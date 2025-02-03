package com.rohit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.bean.Employee;
import com.rohit.bean.Student;
import com.rohit.config.AppConfig;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee);
		
		Student student = (Student)context.getBean("stud");
		System.out.println(student);

	}
}

package com.rohit;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.bean.Employee;

public class App {
    public static void main( String[] args ){

    AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Employee employee = context.getBean("emp", Employee.class);
    System.out.println(employee);
   // context.registerShutdownHook();
    
    
    }
}

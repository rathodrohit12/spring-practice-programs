package com.rohit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rohit.bean.Student;

@Configuration
@ComponentScan(basePackages = "com.rohit")
public class AppConfig {
	@Bean
    public Student createStudent(){

        return new Student();
    }
}

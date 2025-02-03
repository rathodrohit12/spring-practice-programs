package com.rohit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rohit.bean.Student;

@Configuration
public class AppConfig2 {
	@Bean
    public Student createStudent(){

        return new Student();
    }
}

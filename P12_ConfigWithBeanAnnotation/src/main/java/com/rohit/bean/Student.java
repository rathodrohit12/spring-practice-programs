package com.rohit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.rohit.config.AppConfig;
import com.rohit.config.AppConfig2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component(value = "stud")
public class Student {
	@Value("1")
	private int id;
	
	@Value("Krishna")
	private String name;
	
	@Autowired
	AppConfig config;
	
	@Autowired
	AppConfig2 config2;

}

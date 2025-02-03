package com.rohit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component(value = "adr")
public class Address {
	@Value("pune")
	private String city;
	
	@Value("India")
	private String country;

	
}

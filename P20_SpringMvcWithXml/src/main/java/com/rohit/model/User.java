package com.rohit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
 
	private String name;
	private String email;
	private String mobile;
	private String pass;
	
	
	public User(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}
	
	
	
}

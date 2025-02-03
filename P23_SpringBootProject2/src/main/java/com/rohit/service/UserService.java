package com.rohit.service;

import com.rohit.model.User;

public interface UserService {
	
	public void registerService(User user);
	public boolean loginService(String email, String pass);
		
}
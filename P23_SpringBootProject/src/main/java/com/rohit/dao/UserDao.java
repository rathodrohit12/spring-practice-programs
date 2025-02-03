package com.rohit.dao;

import com.rohit.model.User;

public interface UserDao {
	
	public int registerUser(User user);
	public String loginUser(User user);
}

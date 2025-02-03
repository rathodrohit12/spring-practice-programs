package com.rohit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.dao.UserDao;
import com.rohit.dao.UserImpl;
import com.rohit.model.User;

@Service
public class UserService {
	
	@Autowired
	UserImpl userImpl;
	public void registerService(User user) {
		int registerUser = userImpl.registerUser(user);
		if (registerUser > 0) {
			System.out.println("Register successfull.....");
		}
	}
}








//	public String loginService(User user) {
//		String userName = UserDao.loginUser(user);
//
//		if (userName != null) {
//			System.out.println("Login successful for: " + userName);
//			return userName;
//		} else {
//			System.out.println("Login failed for email: " + user.getEmail());
//			return null;
//		}
//	}
//}

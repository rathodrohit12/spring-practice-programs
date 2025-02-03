package com.rohit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.model.User;
import com.rohit.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public void registerService(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean loginService(String email, String pass) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return false;
        }
        return pass.equals(user.getPass());
    }
}

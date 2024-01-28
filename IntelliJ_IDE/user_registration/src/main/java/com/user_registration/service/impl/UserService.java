package com.user_registration.service.impl;

import com.user_registration.entity.User;
import com.user_registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;



public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        return userRepository.save(user);
    }
}

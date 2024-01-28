package com.user_registration.controller;


import com.user_registration.entity.User;
import com.user_registration.service.impl.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    private UserService userService;
    @PostMapping("/register")
    public Map<String, String>registerUser(@RequestBody User user){
        // Register the user without email verification
       User regiseredUser = userService.registerUser(user);
       return null;
    }

    
}

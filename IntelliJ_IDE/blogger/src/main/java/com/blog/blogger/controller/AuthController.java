package com.blog.blogger.controller;


import com.blog.blogger.entity.Role;
import com.blog.blogger.entity.User;
import com.blog.blogger.payload.JWTAuthResponse;
import com.blog.blogger.payload.LoginDto;
import com.blog.blogger.payload.SignUpDto;
import com.blog.blogger.repository.RoleRepository;
import com.blog.blogger.repository.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.authentication.*;
import java.util.Collections;
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RoleRepository roleRepository;


    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsernameOrEmail(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("User Sign-In successfully", HttpStatus.OK);
        // get token form tokenProvider
        // String token = tokenProvider.generateToken(authentication);

        // return ResponseEntity.ok(new JWTAuthResponse(token));
    }






    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignUpDto signUpDto) {

        if(userRepository.existsByEmail(signUpDto.getEmail())){
            return new ResponseEntity<>("Email id exists : "+signUpDto.getEmail(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if(userRepository.existsByUsername(signUpDto.getUsername())){
            return new ResponseEntity<>("Username exists : "+signUpDto.getUsername(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        User user = new User();
        user.setName(signUpDto.getName());
        user.setEmail(signUpDto.getEmail());
        user.setUsername(signUpDto.getUsername());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));

        Role roles = roleRepository.findByName("ROLE_ADMIN").get();
        user.setRoles(Collections.singleton(roles));


        User savedUser = userRepository.save(user);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }





}



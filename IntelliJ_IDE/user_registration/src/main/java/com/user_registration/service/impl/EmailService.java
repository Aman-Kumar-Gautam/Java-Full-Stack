package com.user_registration.service.impl;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.user_registration.service.impl.EmailVerificationService.emailOtpMapping;



@Service
public class EmailService {

    @Autowired
    private final JavaMailSender javaMailSender;

    @Getter
    private final UserService userService;

    @Autowired
    public EmailService(JavaMailSender javaMailSender, UserService userService) {
        this.javaMailSender = javaMailSender;
        this.userService = userService;
    }

    public String generateOtp() {
        return String.format("%06d", new java.util.Random().nextInt(1000000));
    }

    public Map<String, String> sendOtpEmail(String email) {
        String otp = generateOtp();
        emailOtpMapping.put(email, otp);

        sendEmail(email, "Your OTP is: "+otp);

        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "OTP sent successfully");
        return response;
    }

    private void sendEmail(String to, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("your.gmail@gmail.com");
        message.setTo(to);
        message.setSubject("OTP for Email Verification");
        message.setText(text);
        javaMailSender.send(message);
    }

}


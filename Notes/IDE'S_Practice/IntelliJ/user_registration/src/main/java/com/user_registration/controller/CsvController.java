package com.user_registration.controller;

import com.user_registration.entity.User;
import com.user_registration.service.impl.CsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class CsvController {

    @Autowired
    private CsvService csvService;

    @GetMapping("/users/csv")
    public ResponseEntity<byte[]> downloadUsersCsv() {
        try {
            User user = getUser(); // Get your user data from wherever you retrieve it
            byte[] csvBytes = csvService.generateCsvReport(user);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("filename", "user_report.csv");

            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .body(csvBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Dummy method to simulate getting user data
    private User getUser() {
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        user.setMobile("1234567890");
        user.setEmailVerified(true);
        return user;
    }
}
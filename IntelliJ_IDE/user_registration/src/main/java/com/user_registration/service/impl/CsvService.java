package com.user_registration.service.impl;


import com.user_registration.entity.User;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CsvService {

    public byte[] generateCsvReport(User user) throws IOException {
        StringBuilder csvContent = new StringBuilder();

        // Add CSV headers
        csvContent.append("ID,Name,Email,Mobile,Email Verified\n");

        // Add user data
        csvContent.append(user.getId()).append(",")
                .append(user.getName()).append(",")
                .append(user.getEmail()).append(",")
                .append(user.getMobile()).append(",")
                .append(user.isEmailVerified()).append("\n");

        return csvContent.toString().getBytes();
    }
}

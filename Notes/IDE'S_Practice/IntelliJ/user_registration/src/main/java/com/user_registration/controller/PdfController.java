package com.user_registration.controller;

import com.itextpdf.text.DocumentException;
import com.user_registration.entity.User;
import com.user_registration.service.impl.PdfService;
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
public class PdfController {

    @Autowired
    private PdfService pdfService;

    @GetMapping("/users/pdf")
    public ResponseEntity<byte[]> downloadUsersPdf() {
        try {
            User user = getUser(); // Get your user data from wherever you retrieve it
            byte[] pdfBytes = pdfService.generatePdfReport(user);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("filename", "user_report.pdf");

            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .body(pdfBytes);
        } catch (DocumentException | IOException e) {
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
        return user;
    }
}

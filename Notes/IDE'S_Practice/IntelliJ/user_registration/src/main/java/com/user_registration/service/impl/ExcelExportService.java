package com.user_registration.service.impl;


import com.user_registration.entity.User;
import com.user_registration.repository.UserRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ExcelExportService {

    @Autowired
    private UserRepository userRepository;

    public void exportUsersToExcel() {
        List<User> userList = userRepository.findAll();

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Users");

            // Define cell styles
            CellStyle headerStyle = workbook.createCellStyle();
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerStyle.setFont(headerFont);

            // Create header row
            Row headerRow = sheet.createRow(0);
            String[] headers = {"ID", "Name", "Email", "Mobile", "Email Verified"};
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
                cell.setCellStyle(headerStyle); // Apply bold style to header cells
            }

            // Create data rows
            int rowNum = 1;
            for (User user : userList) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(user.getId());
                row.createCell(1).setCellValue(user.getName());
                row.createCell(2).setCellValue(user.getEmail());
                // Skip adding password to the Excel file
                row.createCell(3).setCellValue(user.getMobile());
                row.createCell(4).setCellValue(user.isEmailVerified());
            }

            try (FileOutputStream outputStream = new FileOutputStream("E://test files//users.xlsx")) {
                workbook.write(outputStream);
                System.out.println("Excel file saved successfully as users.xlsx!");
            }

        } catch (IOException e) {
            throw new RuntimeException("Error exporting users to Excel", e);
        }
    }
}
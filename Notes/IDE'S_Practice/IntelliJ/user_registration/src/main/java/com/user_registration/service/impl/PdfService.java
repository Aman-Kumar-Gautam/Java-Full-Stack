package com.user_registration.service.impl;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.user_registration.entity.User;
import org.springframework.stereotype.Service;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class PdfService {

    public byte[] generatePdfReport(User user) throws DocumentException, IOException {

        Document document = new Document();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter.getInstance(document, baos);

        document.open();

        // Create a table with 5 columns
        PdfPTable table = new PdfPTable(5);

        // Add column headers
        addColumnHeader(table, "ID");
        addColumnHeader(table, "Name");
        addColumnHeader(table, "Email");
        addColumnHeader(table, "Mobile");
        addColumnHeader(table, "Email Verified");

        // Add data rows
        addDataCell(table, String.valueOf(user.getId()));
        addDataCell(table, user.getName());
        addDataCell(table, user.getEmail());
        addDataCell(table, user.getMobile());
        addDataCell(table, String.valueOf(user.isEmailVerified()));

        document.add(table);
        document.close();

        return baos.toByteArray();
    }

    private void addColumnHeader(PdfPTable table, String header) {
        PdfPCell cell = new PdfPCell(new Phrase(header, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell);
    }

    private void addDataCell(PdfPTable table, String data) {
        PdfPCell cell = new PdfPCell(new Phrase(data, FontFactory.getFont(FontFactory.HELVETICA, 12)));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        table.addCell(cell);
    }
}
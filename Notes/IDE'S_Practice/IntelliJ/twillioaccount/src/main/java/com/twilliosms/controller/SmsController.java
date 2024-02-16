package com.twilliosms.controller;

import com.twilliosms.dto.SmsRequest;
import com.twilliosms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    private final SmsService twilioService;

    @Autowired
    public SmsController(SmsService twilioService) {
        this.twilioService = twilioService;
    }

    @PostMapping("/send-sms")
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        twilioService.sendSms(smsRequest.getToPhoneNumber(), smsRequest.getMessage());
    }
}

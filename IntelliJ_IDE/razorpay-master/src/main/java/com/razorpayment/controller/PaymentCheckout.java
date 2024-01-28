package com.razorpayment.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentCheckout {

    //http://localhost:8080/payment
    @GetMapping("/payment")
    public String showPaymentPage() {
        // You may need to retrieve the order details and order ID from your database or service
      //  String orderId = "order_EKwxwAgItmmXdp"; // Replace with the actual order ID

        // Add the order ID to the model
      //  model.addAttribute("orderId", orderId);

        // Return the Thymeleaf template name (without the ".html" extension)
        return "payment-request";
    }
}

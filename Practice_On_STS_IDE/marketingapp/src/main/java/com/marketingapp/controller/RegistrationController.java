package com.marketingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RegistrationController {
	//Handler Methods
	@RequestMapping("/view")
	public String viewRegistrationPage() {
		return "create_lead";
	}
}

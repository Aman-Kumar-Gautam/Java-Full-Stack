package com.marcketingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
	//Handler Methods
	
	
	//http://localhost:8080/view
	@RequestMapping("/view")
	public String viewRegistrationPage() {
		return "create_lead";
	}
}

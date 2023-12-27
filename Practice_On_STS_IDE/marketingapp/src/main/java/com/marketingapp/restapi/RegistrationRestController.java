package com.marketingapp.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.entity.Registration;
import com.marketingapp.repository.RegistrationRepository;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationRestController {
	@Autowired
	private RegistrationRepository registrationRepo;
	
	//http:localhost:8080/api/registrations
	@GetMapping
	public List<Registration>getAllReg(){
		List<Registration> reg = registrationRepo.findAll();
		return reg;
	
	}
	
	
	
	
}

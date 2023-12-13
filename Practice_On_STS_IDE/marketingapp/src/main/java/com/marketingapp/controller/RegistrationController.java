package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.dto.RegistrationDto;
import com.marketingapp.entity.Registration;
import com.marketingapp.service.RegistrationService;
@Controller
public class RegistrationController {
	//Handler Methods
	
	//http://localhost:8080/view
	@Autowired
	private RegistrationService registrationService;

	
	@RequestMapping("/view")
	public String viewRegistrationPage() {
		return "create_lead";
	}
	
	
	// 1st Method to save data in DB
	
//	@RequestMapping("/saveReg")
//	public String saveRegistration(Registration registration) {
//		registrationService.saveRegistration(registration);
//		return "create_lead";
//	}
	
	
//	// 2nd Method to save data in DB
//	
//	@RequestMapping("/saveReg")
//	public String saveRegistration
//	(@ModelAttribute Registration registration) {
//		registrationService.saveRegistration(registration);
//		return "create_lead";
//	}
	
	
	// 3rd Method to save data in DB
	
	
	
//	@RequestMapping("/saveReg")
//	public String saveRegistration(
//			@RequestParam("x") String firstName,
//			@RequestParam("lastName") String lastName,
//			@RequestParam("email") String email,
//			@RequestParam("mobile")long mobile
//			) {
//		Registration reg = new Registration();
//		reg.setFirstName(firstName);
//		reg.setLastName(lastName);
//		reg.setEmail(email);
//		reg.setMobile(mobile);
//		registrationService.saveRegistration(reg);
//		return "create_lead";
//		
//		
//	}
	
		@RequestMapping("/saveReg")
		public String saveRegistration(RegistrationDto dto, Model model) {
			Registration reg = new Registration();
			reg.setFirstName(dto.getFirstName());
			reg.setLastName(dto.getLastName());
			reg.setEmail(dto.getEmail());
			reg.setMobile(dto.getMobile());
			registrationService.saveRegistration(reg);
			
			model.addAttribute("msg", "Record is saved ..!");
			return "create_lead";
			
		}
		@RequestMapping("/getAllReg")
		public String getAllRegistrations(Model model) {
			List<Registration> registrations = registrationService.getAllRegistrations();
			{
				model.addAttribute("registrations", registrations);
				return "list_registrations";
			}
		}
	
		@RequestMapping("/delete")
		public String deleteLead(@RequestParam long id, Model model) {
			registrationService.deleteLead(id);
			List<Registration> registrations = registrationService.getAllRegistrations();
			{
				model.addAttribute("registrations", registrations);
				return "list_registrations";
		
			}
	
		}
}

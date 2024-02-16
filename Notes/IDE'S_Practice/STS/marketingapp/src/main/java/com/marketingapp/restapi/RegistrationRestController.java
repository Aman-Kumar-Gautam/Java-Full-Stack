package com.marketingapp.restapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.entity.Registration;
import com.marketingapp.repository.RegistrationRepository;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationRestController {
	@Autowired
	private RegistrationRepository registrationRepo;

	// http:localhost:8080/api/registrations
	@GetMapping
	public List<Registration> getAllReg() {
		List<Registration> reg = registrationRepo.findAll();
		return reg;

	}

	@PostMapping
	public void saveRegistrations(@RequestBody Registration registration) {
		registrationRepo.save(registration);
	}

	// http:localhost:8080/api/registrations/1
	@DeleteMapping("/{id}")
	public void deleteRegistration(@PathVariable long id) {
		registrationRepo.deleteById(id);
	}

	@PutMapping("/{id}")
	public void updateRegistration(@PathVariable long id, @RequestBody Registration registration) {
		Optional<Registration> findById = registrationRepo.findById(id);
		Registration reg = findById.get();
		
		reg.setFirstName(registration.getFirstName());
		reg.setLastName(registration.getLastName());
		reg.setEmail(registration.getEmail());
		reg.setMobile(registration.getMobile());
		registrationRepo.save(reg);
	}

}

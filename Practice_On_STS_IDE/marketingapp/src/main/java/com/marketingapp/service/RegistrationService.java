package com.marketingapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entity.Registration;
import com.marketingapp.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository registrationRepo;
	
	public void saveRegistration(Registration registration) {
		registrationRepo.save(registration);
		
	}

	public List<Registration> getAllRegistrations() {
		
		List<Registration> registrations = registrationRepo.findAll();
		return registrations;
	
	
	}

	public void deleteLead(long id) {
		// TODO Auto-generated method stub
		registrationRepo.deleteById(id);
	}

	public Registration getRegistrationById(long id) {
		// TODO Auto-generated method stub
		Optional<Registration> findById = registrationRepo.findById(id);
		return findById.get();
	}

	public void saveUpdatedRegistration(Registration reg) {
		// TODO Auto-generated method stub
		registrationRepo.save(reg);
	}
	
}

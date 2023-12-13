package com.marketingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long>{

}

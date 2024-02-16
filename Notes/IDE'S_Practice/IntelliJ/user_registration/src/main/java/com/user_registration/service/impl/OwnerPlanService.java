package com.user_registration.service.impl;

import com.user_registration.entity.OwnerPlan;
import com.user_registration.repository.OwnerPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OwnerPlanService {

    @Autowired
    private OwnerPlanRepository ownerPlanRepository;

    public List<OwnerPlan> getAllOwnerPlans() {
        return ownerPlanRepository.findAll();
    }

    public Optional<OwnerPlan> getOwnerPlanById(Long id) {
        return ownerPlanRepository.findById(id);
    }

    public OwnerPlan createOwnerPlan(OwnerPlan ownerPlan) {
        return ownerPlanRepository.save(ownerPlan);
    }

    public void deleteOwnerPlan(Long id) {
        ownerPlanRepository.deleteById(id);
    }

    // Method to subscribe owner plan for a specific number of days
    public void subscribeOwnerPlanForDays(Long id, int days) {
        Optional<OwnerPlan> optionalOwnerPlan = ownerPlanRepository.findById(id);
        if (optionalOwnerPlan.isPresent()) {
            OwnerPlan ownerPlan = optionalOwnerPlan.get();
            // Implement subscription logic here (e.g., updating user's subscription status)
            System.out.println("Subscribed to " + ownerPlan.getName() + " for " + days + " days");
        } else {
            throw new RuntimeException("Owner plan not found with id: " + id);
        }
    }
}

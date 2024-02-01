package com.user_registration.controller;

import com.user_registration.entity.OwnerPlan;
import com.user_registration.service.impl.OwnerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/owner-plans")
public class OwnerPlanController {

    @Autowired
    private OwnerPlanService ownerPlanService;

    @GetMapping
    public List<OwnerPlan> getAllOwnerPlans() {
        return ownerPlanService.getAllOwnerPlans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OwnerPlan> getOwnerPlanById(@PathVariable Long id) {
        Optional<OwnerPlan> ownerPlan = ownerPlanService.getOwnerPlanById(id);
        return ownerPlan.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<OwnerPlan> createOwnerPlan(@RequestBody OwnerPlan ownerPlan) {
        OwnerPlan createdOwnerPlan = ownerPlanService.createOwnerPlan(ownerPlan);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOwnerPlan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOwnerPlan(@PathVariable Long id) {
        ownerPlanService.deleteOwnerPlan(id);
        return ResponseEntity.noContent().build();
    }

    // New endpoints for subscription
    @PostMapping("/{id}/subscribe/{days}-days")
    public ResponseEntity<String> subscribeOwnerPlanForDays(@PathVariable Long id, @PathVariable int days) {
        try {
            ownerPlanService.subscribeOwnerPlanForDays(id, days);
            return ResponseEntity.ok("Subscribed to plan for " + days + " days");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
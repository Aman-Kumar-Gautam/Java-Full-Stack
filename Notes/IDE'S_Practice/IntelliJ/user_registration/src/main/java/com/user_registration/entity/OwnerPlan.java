package com.user_registration.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Setter
@Getter
@Entity
public class OwnerPlan {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private int duration; // Duration in days

    // Constructors
    public OwnerPlan() {
    }

    public OwnerPlan(String name, String description, double price, int duration) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
    }

}
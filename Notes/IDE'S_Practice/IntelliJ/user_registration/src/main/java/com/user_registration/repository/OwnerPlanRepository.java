package com.user_registration.repository;

import com.user_registration.entity.OwnerPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerPlanRepository extends JpaRepository<OwnerPlan, Long> {
}

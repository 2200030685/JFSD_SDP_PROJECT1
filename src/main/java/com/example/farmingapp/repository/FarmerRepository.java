package com.example.farmingapp.repository;

import com.example.farmingapp.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long> {
    // Query to find farmer by email
    Farmer findByEmail(String email);
}

package com.vitatrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vitatrack.model.HealthData;

public interface HealthRepository extends JpaRepository<HealthData, Long> {

}
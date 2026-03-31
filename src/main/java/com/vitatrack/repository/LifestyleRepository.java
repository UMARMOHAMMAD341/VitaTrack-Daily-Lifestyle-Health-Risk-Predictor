package com.vitatrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vitatrack.model.Lifestyle;

public interface LifestyleRepository extends JpaRepository<Lifestyle, Integer> {

}
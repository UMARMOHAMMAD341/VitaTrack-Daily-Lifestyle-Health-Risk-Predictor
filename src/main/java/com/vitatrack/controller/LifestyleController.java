package com.vitatrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vitatrack.model.Lifestyle;
import com.vitatrack.repository.LifestyleRepository;

@RestController
@RequestMapping("/api/lifestyle")
@CrossOrigin(origins="*")
public class LifestyleController {

    @Autowired
    LifestyleRepository repo;

    @PostMapping("/submit")
    public Lifestyle saveData(@RequestBody Lifestyle life) {

        String risk = "Low";

        if (life.getSleepHours() < 5 || life.getExerciseMinutes() < 10) {
            risk = "High";
        } else if (life.getSleepHours() < 7) {
            risk = "Medium";
        }

        life.setRiskLevel(risk);

        return repo.save(life);
    }
}
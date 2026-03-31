package com.vitatrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vitatrack.model.HealthData;
import com.vitatrack.repository.HealthRepository;

@RestController
@RequestMapping("/api/health")
@CrossOrigin(origins="*")
public class HealthController {

    @Autowired
    private HealthRepository healthRepository;

    @GetMapping("/all")
    public List<HealthData> getAllHealth(){
        return healthRepository.findAll();
    }

    @PostMapping("/add")
    public HealthData addHealth(@RequestBody HealthData data){
        return healthRepository.save(data);
    }
}
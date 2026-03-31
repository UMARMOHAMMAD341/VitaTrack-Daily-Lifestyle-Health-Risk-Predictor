package com.vitatrack.model;

import jakarta.persistence.*;

@Entity
public class Lifestyle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int sleepHours;
    private int exerciseMinutes;
    private int waterIntake;
    private String junkFood;
    private String riskLevel;

    public int getId() {
        return id;
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(int sleepHours) {
        this.sleepHours = sleepHours;
    }

    public int getExerciseMinutes() {
        return exerciseMinutes;
    }

    public void setExerciseMinutes(int exerciseMinutes) {
        this.exerciseMinutes = exerciseMinutes;
    }

    public int getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(int waterIntake) {
        this.waterIntake = waterIntake;
    }

    public String getJunkFood() {
        return junkFood;
    }

    public void setJunkFood(String junkFood) {
        this.junkFood = junkFood;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}
package com.example.bike;

public class Bike {
    private String bikeId;
    private String name;
    private String model;
    private int year;
    private int topSpeed;
    private double bikeMileage;

    public Bike(int bikeId, String name, String model, int year, int topSpeed, double bikeMileage) {
        this.bikeId = String.valueOf(bikeId);
        this.name = name;
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
        this.bikeMileage = bikeMileage;
    }

    public String getBikeId() {
        return bikeId;
    }

    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getBikeMileage() {
        return bikeMileage;
    }

    public void setBikeMileage(double bikeMileage) {
        this.bikeMileage = bikeMileage;
    }
}

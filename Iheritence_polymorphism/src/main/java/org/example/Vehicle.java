package org.example;

public class Vehicle {

    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void increaseSpeed(int change) {
        this.speed += change;
    }

    public void decreaseSpeed(int change) {
        this.speed -= change;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String displayInfo() {
        return this.getBrand() + " going at " + this.getSpeed() + " km/h";
    }
}
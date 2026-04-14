package org.example;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String displayInfo() {
        return this.getBrand() + " with " + this.getNumberOfDoors() +  " doors going at " + this.getSpeed() + " km/h";
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

}
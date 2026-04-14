package org.example;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String brand, int speed, double loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return this.loadCapacity;
    }

    @Override
    public String displayInfo() {
        return this.getBrand() + " going at " + this.getSpeed() + " km/h and can carry a load of " + this.getLoadCapacity() + " N";
    }
}
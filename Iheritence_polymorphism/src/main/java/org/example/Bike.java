package org.example;

public class Bike extends Vehicle{
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public boolean getHasCarrier() {
        return this.hasCarrier;
    }

    @Override
    public String displayInfo() {
        if (hasCarrier) {
            return this.getBrand() + " going at " + this.getSpeed() + " km/h and has a carrier";
        } else {
            return this.getBrand() + " going at " + this.getSpeed() + " km/h and has no carrier";

        }
    }
}
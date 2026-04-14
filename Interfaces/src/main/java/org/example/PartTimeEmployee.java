package org.example;

public class PartTimeEmployee implements Payable{

    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    //Overides the method inside of interface
    @Override
    public double calculatePay() {
        return this.hourlyRate * this.hoursWorked;
    }
}

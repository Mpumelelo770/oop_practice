package org.example;

public class FullTimeEmployee implements Payable{

    private String name;
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    //overides methods inside interface
    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

package org.example;

public class Freelancer implements Payable{

    //fields or attributes

    private String name;
    private double ratePerProject;
    private int projectsCompleted;

    //constructor
    public Freelancer(String name, double ratePerProject, int projectsCompleted) {
        this.name = name;
        this.ratePerProject = ratePerProject;
        this.projectsCompleted = projectsCompleted;
    }

    //Overides the methods inside the interface
    @Override
    public double calculatePay() {
        return this.ratePerProject * this.projectsCompleted;
    }
}

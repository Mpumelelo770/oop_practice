package org.example;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Shared method
    public void describe() {
        System.out.println("This is a " + color + " shape");
    }

    // Abstract methods (MUST be implemented)
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
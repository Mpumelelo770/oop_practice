package org.example;

public class Circle extends Shape{

    private double radius;
    private final double PI = 3.14;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    //Methods that must definitely be implemented as enforced by abstract class
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

package org.example;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color,double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    //Methods that must definitely be implemented as enforced by abstract class
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Shape circle = new Circle("red", 5);
        Shape rectangle = new Rectangle("blue", 4, 5);
        rectangle.describe();
    }
}

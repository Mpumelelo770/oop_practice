package org.example;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("BMW", 10, 4);
        Vehicle bike = new Bike("BMX", 20, true);
        Vehicle truck = new Truck("Benz", 5, 1000);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        for (Vehicle current: vehicles) {
            System.out.println(current.displayInfo());
        }
    }

}

package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Payable employee1 = new FullTimeEmployee("Mpumelelo", 1000);
        Payable employee2 = new PartTimeEmployee("Colleen", 10, 5);
        Payable employee3 = new Freelancer("Mpumelelo", 1000, 5);

        List<Payable> workers = new ArrayList<>();
        workers.add(employee1);
        workers.add(employee2);
        workers.add(employee3);

        for (Payable p : workers) {
            System.out.println(p.calculatePay());
        }
    }
}

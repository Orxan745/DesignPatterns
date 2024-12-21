package org.example.prototypepattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of car: ");
        String name = scanner.next();
        System.out.print("Please enter the color of car: ");
        String color = scanner.next();
        System.out.print("Please enter the serial number of car: ");
        Integer serialNumber = scanner.nextInt();
        Car mercedes = new Car(name, color, serialNumber);
        System.out.println(mercedes);
        System.out.println("------------------------------------------");

        Car cloneMercedes = new Car(null,null,null);
        cloneMercedes.makeClone(mercedes);
        System.out.println(cloneMercedes);
    }
}

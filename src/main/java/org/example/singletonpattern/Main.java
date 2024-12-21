package org.example.singletonpattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the object number: ");
        Integer objectNumber = scanner.nextInt();
        FooObject object = FooObject.createObject(objectNumber);
        System.out.println(object);

        System.out.print("Please enter the object number: ");
        Integer objectNumber1 = scanner.nextInt();
        FooObject object1 = FooObject.createObject(objectNumber1);
        System.out.println(object1);
    }
}
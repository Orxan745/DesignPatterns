package org.example.prototypepattern;

public class Car {

    private String color;

    private String name;

    private Integer serialNumber;

    public Car(String name, String color, Integer serialNumber) {
        this.name = name;
        this.color = color;
        this.serialNumber = serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    public void makeClone(Car car) {
        this.name = car.name;
        this.color = car.color;
        this.serialNumber = car.serialNumber;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\n" +
                "Color: "+this.color+"\n" +
                "Serial number: "+this.serialNumber;
    }
}

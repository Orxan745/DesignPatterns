package org.example.builderpattern;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.setRam(8);
        builder.setProcessor("Intel i9 9900k");
        builder.setMemory(512);
        builder.setMonitor("LG");
        Computer acer = builder.build();
        System.out.println(acer);
    }
}
package org.example.builderpattern;

public final class Computer {

    private final String monitor;

    private final String processor;

    private final String graphicCard;

    private final Integer ram;

    private final Integer memory;

    private final String motherboard;

    public Computer(String monitor, String processor, String graphicCard,
                    Integer ram, Integer memory, String motherboard) {
        this.monitor = monitor;
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.ram = ram;
        this.memory = memory;
        this.motherboard = motherboard;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getMemory() {
        return memory;
    }

    public String getMotherboard() {
        return motherboard;
    }

    @Override
    public String toString() {
        return "Monitor: "+this.monitor+"\n" +
                "Processor: "+this.processor+"\n" +
                "Graphic card: "+this.graphicCard+"\n" +
                "Ram: "+this.ram+"\n" +
                "Memory: "+this.memory+"\n" +
                "Motherboard: "+this.motherboard;
    }
}
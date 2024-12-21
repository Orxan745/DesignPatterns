package org.example.builderpattern;

public class ComputerBuilder {

    private String monitor;

    private String processor;

    private String graphicCard;

    private Integer ram;

    private Integer memory;

    private String motherboard;

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public Computer build() {
        return new Computer(monitor, processor, graphicCard, ram, memory, motherboard);
    }
}
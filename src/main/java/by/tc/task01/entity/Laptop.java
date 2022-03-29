package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance {
    double batteryCapacity;
    String os;
    int memoryRom;
    int systemMemory;
    double cpu;
    int displayInchs;

    public Laptop() {
    }

    public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", os='" + os + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", displayInchs='" + displayInchs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 && memoryRom == laptop.memoryRom && systemMemory == laptop.systemMemory && Double.compare(laptop.cpu, cpu) == 0 && displayInchs == laptop.displayInchs && os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
    }
}

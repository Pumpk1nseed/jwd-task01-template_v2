package by.tc.task01.entity;

public class Laptop extends Appliance{
    String batteryCapacity;
    String os;
    String memoryRom;
    String systemMemory;
    String cpu;
    String displayInchs;

    public Laptop(String batteryCapacity, String os, String memoryRom, String systemMemory, String cpu, String displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    @Override
    public String get(String parameter) {
        switch (parameter) {
            case "BATTERY_CAPACITY":
                return getBatteryCapacity();
            case "OS":
                return getOs();
            case "MEMORY_ROM":
                return getMemoryRom();
            case "SYSTEM_MEMORY":
                return getSystemMemory();
            case "CPU":
                return getCpu();
            case "DISPLAY_INCHS":
                return getDisplayInchs();
            default:
                return null;
        }
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public String getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(String systemMemory) {
        this.systemMemory = systemMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(String displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", os='" + os + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", displayInchs='" + displayInchs + '\'' +
                '}';
    }
}

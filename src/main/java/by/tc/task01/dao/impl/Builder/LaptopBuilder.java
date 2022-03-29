package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Laptop;

public class LaptopBuilder extends ApplianceBuilder {

    public LaptopBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public Laptop build() {

        double batteryCapacity = Double.parseDouble(parameters[0]);
        String os = parameters[1];
        int memoryRom = Integer.parseInt(parameters[2]);
        int systemMemory = Integer.parseInt(parameters[3]);
        double cpu = Double.parseDouble(parameters[4]);
        int displayInchs = Integer.parseInt(parameters[5]);

        Laptop laptop = new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
        return laptop;
    }
}

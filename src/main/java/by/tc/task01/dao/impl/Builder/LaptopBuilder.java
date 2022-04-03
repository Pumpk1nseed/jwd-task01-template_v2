package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Laptop;

public class LaptopBuilder extends ApplianceBuilder {

    public LaptopBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public Laptop build() {

        String manufacturer = parameters[0];
        double batteryCapacity = Double.parseDouble(parameters[1]);
        String os = parameters[2];
        int memoryRom = Integer.parseInt(parameters[3]);
        int systemMemory = Integer.parseInt(parameters[4]);
        double cpu = Double.parseDouble(parameters[5]);
        int displayInchs = Integer.parseInt(parameters[6]);
        double price = Double.parseDouble(parameters[7]);

        Laptop laptop = new Laptop(manufacturer, batteryCapacity, os, memoryRom, systemMemory, cpu,
                displayInchs, price);
        return laptop;
    }
}

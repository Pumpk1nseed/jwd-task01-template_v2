package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Laptop;

public class LaptopBuilder implements ApplianceBuilder{

    @Override
    public Laptop build(String[] applianceParameters) {
        Laptop laptop = new Laptop();

        laptop.setBatteryCapacity(Double.parseDouble(applianceParameters[0]));
        laptop.setOs(applianceParameters[1]);
        laptop.setMemoryRom(Integer.parseInt(applianceParameters[2]));
        laptop.setSystemMemory(Integer.parseInt(applianceParameters[3]));
        laptop.setCpu(Double.parseDouble(applianceParameters[4]));
        laptop.setDisplayInchs(Integer.parseInt(applianceParameters[5]));

        return laptop;
    }
}

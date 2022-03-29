package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder extends ApplianceBuilder {

    public TabletPCBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public TabletPC build() {

        int batteryCapacity = Integer.parseInt(parameters[0]);
        int displayInches = Integer.parseInt(parameters[1]);
        int memoryRom = Integer.parseInt(parameters[2]);
        int flashMemoryCapacity = Integer.parseInt(parameters[3]);
        String color = parameters[4].trim();

        TabletPC tabletPC = new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
        return tabletPC;
    }
}

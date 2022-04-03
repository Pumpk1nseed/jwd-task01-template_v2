package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder extends ApplianceBuilder {

    public TabletPCBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public TabletPC build() {

        String manufacturer = parameters[0];
        int batteryCapacity = Integer.parseInt(parameters[1]);
        int displayInches = Integer.parseInt(parameters[2]);
        int memoryRom = Integer.parseInt(parameters[3]);
        int flashMemoryCapacity = Integer.parseInt(parameters[4]);
        String color = parameters[5].trim();
        double price = Double.parseDouble(parameters[6]);

        TabletPC tabletPC = new TabletPC(manufacturer, batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color, price);
        return tabletPC;
    }
}

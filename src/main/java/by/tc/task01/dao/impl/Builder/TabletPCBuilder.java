package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder implements ApplianceBuilder {

    @Override
    public TabletPC build(String[] applianceParameters) {
        TabletPC tabletPC = new TabletPC();

        tabletPC.setBatteryCapacity(Integer.parseInt(applianceParameters[0]));
        tabletPC.setDisplayInches(Integer.parseInt(applianceParameters[1]));
        tabletPC.setMemoryRom(Integer.parseInt(applianceParameters[2]));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt(applianceParameters[3]));
        tabletPC.setColor(applianceParameters[4].trim());

        return tabletPC;
    }
}

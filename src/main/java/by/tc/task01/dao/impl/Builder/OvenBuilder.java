package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Oven;

public class OvenBuilder implements ApplianceBuilder {

    @Override
    public Oven build(String[] applianceParameters) {
        Oven oven = new Oven();

        oven.setPowerConsumption(Integer.parseInt(applianceParameters[0]));
        oven.setWeight(Integer.parseInt(applianceParameters[1]));
        oven.setCapacity(Integer.parseInt(applianceParameters[2]));
        oven.setDepth(Integer.parseInt(applianceParameters[3]));
        oven.setHeight(Double.parseDouble(applianceParameters[4]));
        oven.setWidth(Double.parseDouble(applianceParameters[5]));

        return oven;
    }
}

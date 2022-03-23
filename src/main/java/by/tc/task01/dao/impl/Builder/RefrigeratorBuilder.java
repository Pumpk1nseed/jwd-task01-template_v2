package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder implements ApplianceBuilder {

    @Override
    public Refrigerator build(String[] applianceParameters) {
        Refrigerator refrigerator = new Refrigerator();

        refrigerator.setPowerConsumption(Integer.parseInt(applianceParameters[0]));
        refrigerator.setWeight(Integer.parseInt(applianceParameters[1]));
        refrigerator.setFreezerCapacity(Integer.parseInt(applianceParameters[2]));
        refrigerator.setOveralCapacity(Double.parseDouble(applianceParameters[3]));
        refrigerator.setHeight(Double.parseDouble(applianceParameters[4]));
        refrigerator.setWidth(Double.parseDouble(applianceParameters[5]));

        return refrigerator;
    }
}

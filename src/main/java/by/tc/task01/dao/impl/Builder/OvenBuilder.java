package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Oven;

public class OvenBuilder extends ApplianceBuilder {

    public OvenBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public Oven build() {

        String manufacturer = parameters[0];
        int powerConsumption = Integer.parseInt(parameters[1]);
        int weight = Integer.parseInt(parameters[2]);
        int capacity = Integer.parseInt(parameters[3]);
        int depth = Integer.parseInt(parameters[4]);
        double height = Double.parseDouble(parameters[5]);
        double width = Double.parseDouble(parameters[6]);
        double price = Double.parseDouble(parameters[7]);

        Oven oven = new Oven(manufacturer, powerConsumption, weight, capacity, depth, height, width, price);
        return oven;
    }
}

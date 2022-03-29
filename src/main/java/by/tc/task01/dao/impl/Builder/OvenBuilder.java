package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Oven;

public class OvenBuilder extends ApplianceBuilder {

    public OvenBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public Oven build() {

        int powerConsumption = Integer.parseInt(parameters[0]);
        int weight = Integer.parseInt(parameters[1]);
        int capacity = Integer.parseInt(parameters[2]);
        int depth = Integer.parseInt(parameters[3]);
        double height = Double.parseDouble(parameters[4]);
        double width = Double.parseDouble(parameters[5]);

        Oven oven = new Oven(powerConsumption, weight, capacity, depth, height, width);
        return oven;
    }
}

package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder extends ApplianceBuilder {

    public RefrigeratorBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public Refrigerator build() {

        int powerConsumption = Integer.parseInt(parameters[0]);
        int weight = Integer.parseInt(parameters[1]);
        int freezerCapacity = Integer.parseInt(parameters[2]);
        double overalCapacity = Double.parseDouble(parameters[3]);
        double height = Double.parseDouble(parameters[4]);
        double width = Double.parseDouble(parameters[5]);

        Refrigerator refrigerator = new Refrigerator(powerConsumption, weight, freezerCapacity, overalCapacity, height, width);
        return refrigerator;
    }
}

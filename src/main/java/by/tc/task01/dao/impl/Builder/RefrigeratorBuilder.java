package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder extends ApplianceBuilder {

    public RefrigeratorBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public Refrigerator build() {

        String manufacturer = parameters[0];
        int powerConsumption = Integer.parseInt(parameters[1]);
        int weight = Integer.parseInt(parameters[2]);
        int freezerCapacity = Integer.parseInt(parameters[3]);
        double overalCapacity = Double.parseDouble(parameters[4]);
        double height = Double.parseDouble(parameters[5]);
        double width = Double.parseDouble(parameters[6]);
        double price = Double.parseDouble(parameters[7]);

        Refrigerator refrigerator = new Refrigerator(manufacturer, powerConsumption, weight, freezerCapacity,
                overalCapacity, height, width, price);
        return refrigerator;
    }
}

package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder extends ApplianceBuilder {

    public VacuumCleanerBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public VacuumCleaner build() {

        String manufacturer = parameters[0];
        int powerConsumption = Integer.parseInt(parameters[1]);
        String filterType = parameters[2];
        String bagType = parameters[3];
        String wandType = parameters[4];
        int motorSpeedRegulation = Integer.parseInt(parameters[5]);
        int cleaningWidth = Integer.parseInt(parameters[6]);
        double price = Double.parseDouble(parameters[7]);

        VacuumCleaner vacuumCleaner = new VacuumCleaner(manufacturer, powerConsumption, filterType, bagType,
                wandType, motorSpeedRegulation, cleaningWidth, price);
        return vacuumCleaner;
    }

}

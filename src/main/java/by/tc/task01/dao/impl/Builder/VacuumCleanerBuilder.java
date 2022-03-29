package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder extends ApplianceBuilder {

    public VacuumCleanerBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public VacuumCleaner build() {

        int powerConsumption = Integer.parseInt(parameters[0]);
        String filterType = parameters[1];
        String bagType = parameters[2];
        String wandType = parameters[3];
        int motorSpeedRegulation = Integer.parseInt(parameters[4]);
        int cleaningWidth = Integer.parseInt(parameters[5]);

        VacuumCleaner vacuumCleaner = new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
        return vacuumCleaner;
    }

}

package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder implements ApplianceBuilder {

    @Override
    public VacuumCleaner build(String[] applianceParameters) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        vacuumCleaner.setPowerConsumption(Integer.parseInt(applianceParameters[0]));
        vacuumCleaner.setFilterType(applianceParameters[1]);
        vacuumCleaner.setBagType(applianceParameters[2]);
        vacuumCleaner.setWandType(applianceParameters[3]);
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(applianceParameters[4]));
        vacuumCleaner.setCleaningWidth(Integer.parseInt(applianceParameters[5]));

        return vacuumCleaner;
    }

}

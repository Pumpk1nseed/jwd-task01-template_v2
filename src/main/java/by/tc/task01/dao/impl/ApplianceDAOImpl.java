package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.Builder.*;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//олицетворить переменные
public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> applianceFound = new ArrayList<>();
        String applianceDbFile = Objects.requireNonNull(getClass().getClassLoader().getResource("appliances_db.txt").getPath());

        try {
            FileReader dbReader = new FileReader(applianceDbFile);
            Scanner db = new Scanner(dbReader);

            while (db.hasNextLine()) {
                String applianceInfo = db.nextLine();

                if (!applianceInfo.isEmpty()) {
                    if (applianceInfo.split(" :")[0].equals(criteria.getGroupSearchName())) {
                        boolean found = true;
                        for (Map.Entry<String, Object> criteriaParameters : criteria.getCriteria().entrySet()) {
                            if (!applianceInfo.matches(".+" + criteriaParameters.getKey()
                                    + "=" + criteriaParameters.getValue().toString() + "(|([,;\\s].*))")) {
                                found = false;
                            }
                        }
                        if (found) {
                            applianceFound.add(createAppliance(applianceInfo, criteria.getGroupSearchName()));
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return applianceFound;
    }

    public Appliance createAppliance(String applianceInfo, String applianceName) {
        switch (applianceName) {
            case "Oven":
                return new OvenBuilder(applianceInfo).build();
            case "Laptop":
                return new LaptopBuilder(applianceInfo).build();
            case "Refrigerator":
                return new RefrigeratorBuilder(applianceInfo).build();
            case "VacuumCleaner":
                return new VacuumCleanerBuilder(applianceInfo).build();
            case "TabletPC":
                return new TabletPCBuilder(applianceInfo).build();
            case "Speakers":
                return new SpeakersBuilder(applianceInfo).build();
            default:
                throw new RuntimeException("No builder found to create an appliance!");
        }
    }

}

package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.Builder.*;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

//олицетворить переменные
public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> applianceFound = new ArrayList<>();
        String applianceDbFile = Objects.requireNonNull(getClass().getClassLoader().getResource("appliances_db.txt").getPath());

        try {
            FileReader fileReader = new FileReader(applianceDbFile);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                String applianceInfo = scanner.nextLine();

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
        }
        return applianceFound;
    }

    public Appliance createAppliance(String applianceInfo, String applianceName) {
        String[] parameters = getApplianceParameters(applianceInfo);

        switch (applianceName) {
            case "Oven":
                return new OvenBuilder().build(parameters);
            case "Laptop":
                return new LaptopBuilder().build(parameters);
            case "Refrigerator":
                return new RefrigeratorBuilder().build(parameters);
            case "VacuumCleaner":
                return new VacuumCleanerBuilder().build(parameters);
            case "TabletPC":
                return new TabletPCBuilder().build(parameters);
            case "Speakers":
                return new SpeakersBuilder().build(parameters);
            default:
                throw new RuntimeException("An error occurred while creating the appliance!");
        }
    }

    public String[] getApplianceParameters(String applianceInfo) {
        char[] charApplianceInfo = applianceInfo.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < charApplianceInfo.length; i++) {
            if (charApplianceInfo[i] == '=') {
                while (charApplianceInfo[i] != ',' && i < charApplianceInfo.length - 1) {
                    i++;
                    if (charApplianceInfo[i] != ';') {
                        builder.append(charApplianceInfo[i]);
                    }
                }
            }
        }
        String[] applianceParameters = builder.toString().split(",");
        return applianceParameters;
    }

}

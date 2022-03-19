package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
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
                        boolean flag = true;
                        for (Map.Entry<String, Object> criteriaParameters : criteria.getCriteria().entrySet()) {
                            if (!applianceInfo.matches(".+" + criteriaParameters.getKey()
                                    + "=" + criteriaParameters.getValue().toString().toLowerCase() + ".[^\\.]+")) {
                                flag = false;
                            }
                        }
                        if (flag) {
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

    //реализовать через Builder
    public Appliance createAppliance(String applianceInfo, String applianceName) {
        String[] parameters = getApplianceParameters(applianceInfo);

        switch (applianceName) {
            case "Oven":
                return new Oven(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
            case "Laptop":
                return new Laptop(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
            case "Refrigerator":
                return new Refrigerator(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
            case "VacuumCleaner":
                return new VacuumCleaner(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
            case "TabletPC":
                return new TabletPC(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4].trim());
            case "Speakers":
                return new Speakers(parameters[0], parameters[1], parameters[2], parameters[3]);
            default:
                return null;
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

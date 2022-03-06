package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {


    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> appliances = readAppliancesFromDb();

        for (Appliance appliance : appliances) {
            if (appliance.getClass().getSimpleName().equals(criteria.getGroupSearchName())) {
                for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
                    if (appliance.get(entry.getKey()).equals(entry.getValue().toString().toLowerCase())) {
                    } else {
                        appliances.remove(appliance);
                    }
                }
            } else {
                appliances.remove(appliance);
            }
        }
        return appliances;
    }

    public List<Appliance> readAppliancesFromDb() {
        List<Appliance> appliances = new CopyOnWriteArrayList<>();

        try {
            FileReader fileReader = new FileReader("src/main/resources/appliances_db.txt");
            Scanner scanner = new Scanner(fileReader);

            String line;
            String applianceName;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (!line.isEmpty()) {
                    applianceName = line.split(" :")[0];
                    appliances.add(createAppliance(line, applianceName));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return appliances;
    }

    public Appliance createAppliance(String line, String applianceName) {
        String[] parameters = getParameters(line);

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

    public String[] getParameters(String line) {
        char[] charLine = line.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < charLine.length; i++) {
            if (charLine[i] == '=') {
                while (charLine[i] != ',' && i < charLine.length - 1) {
                    i++;
                    builder.append(charLine[i]);
                }
            }
        }
        String[] str = builder.toString().split(",");
        return str;
    }

}
// you may add your own code here

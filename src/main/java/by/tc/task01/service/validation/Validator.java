package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {

        int numOfCoincidence = 0;
        for (Class<?> applianceName : SearchCriteria.class.getClasses()) {
            for (String searchCriteria : criteria.getCriteria().keySet()) {
                if (applianceName.getSimpleName().equals(criteria.getGroupSearchName())) {
                    for (Object applianceParameter : applianceName.getEnumConstants()) {
                        if (searchCriteria.equals(applianceParameter.toString())) {
                            numOfCoincidence++;
                        }
                    }
                }
            }
        }
        return numOfCoincidence == criteria.getCriteria().size();
    }
}

//you may add your own new classes
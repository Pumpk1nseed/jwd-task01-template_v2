package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

    private String groupSearchName;
    private Map<String, Object> criteria = new HashMap<String, Object>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Map<String, Object> getCriteria() {
        return criteria;
    }

    public boolean findCriteriaInLine(String applianceInfo) {
        boolean found = true;
        for (Map.Entry<String, Object> criteriaParameters : criteria.entrySet()) {
            if (!findCriteriaParametersInLine(applianceInfo, criteriaParameters)) {
                found = false;
            }
        }
        return found;
    }

    private boolean findCriteriaParametersInLine(String applianceInfo, Map.Entry<String, Object> criteriaParameters) {
        return applianceInfo.matches(".+" + criteriaParameters.getKey()
                + "=" + criteriaParameters.getValue().toString() + "(|([,;\\s].*))");
    }

    public boolean compareWithSearchCriteria() {
        int numOfCoincidence = 0;
        for (Class<?> applianceName : SearchCriteria.class.getClasses()) {
            for (String searchCriteria : criteria.keySet()) {
                if (applianceName.getSimpleName().equals(getGroupSearchName())) {
                    for (Object applianceParameter : applianceName.getEnumConstants()) {
                        if (searchCriteria.equals(applianceParameter.toString())) {
                            numOfCoincidence++;
                        }
                    }
                }
            }
        }
        return numOfCoincidence == criteria.size();
    }
}

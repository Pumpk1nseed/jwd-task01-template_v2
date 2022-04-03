package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {

        return criteria.compareWithSearchCriteria();
    }
}

package hu.predicatequery.predicatequery;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class PredicateQuery<T> {
    private EntityManager entityManager;
    private CriteriaBuilder criteriaBuilder;
}

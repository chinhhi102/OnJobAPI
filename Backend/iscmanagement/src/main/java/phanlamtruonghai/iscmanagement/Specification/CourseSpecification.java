package phanlamtruonghai.iscmanagement.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import phanlamtruonghai.iscmanagement.model.Course;
import phanlamtruonghai.iscmanagement.model.SearchCriteria;

public class CourseSpecification implements Specification<Course> {
	private SearchCriteria criteria;
	 
    public CourseSpecification(SearchCriteria searchCriteria) {
		// TODO Auto-generated constructor stub
    	this.criteria = searchCriteria;
	}

	public CourseSpecification() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public Predicate toPredicate(
      Root<Course> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
     
        switch (criteria.getOperation()) {
        case EQUALITY:
            return builder.equal(root.get(criteria.getKey()), criteria.getValue());
        case NEGATION:
            return builder.notEqual(root.get(criteria.getKey()), criteria.getValue());
        case GREATER_THAN:
            return builder.greaterThan(root.<String> get(
              criteria.getKey()), criteria.getValue().toString());
        case LESS_THAN:
            return builder.lessThan(root.<String> get(
              criteria.getKey()), criteria.getValue().toString());
        case LIKE:
            return builder.like(root.<String> get(
              criteria.getKey()), criteria.getValue().toString());
        case STARTS_WITH:
            return builder.like(root.<String> get(criteria.getKey()), criteria.getValue() + "%");
        case ENDS_WITH:
            return builder.like(root.<String> get(criteria.getKey()), "%" + criteria.getValue());
        case CONTAINS:
            return builder.like(root.<String> get(
              criteria.getKey()), "%" + criteria.getValue() + "%");
        default:
            return null;
        }
    }

	public Specification<Course> build() {
		// TODO Auto-generated method stub
		return null;
	}
}

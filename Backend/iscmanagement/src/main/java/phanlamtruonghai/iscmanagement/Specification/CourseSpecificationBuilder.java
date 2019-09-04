package phanlamtruonghai.iscmanagement.Specification;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import phanlamtruonghai.iscmanagement.model.*;
import phanlamtruonghai.iscmanagement.Specification.*;

public class CourseSpecificationBuilder {
	private List<SearchCriteria> params;
	
	public CourseSpecificationBuilder() {
		// TODO Auto-generated constructor stub
	} 
	
    public CourseSpecificationBuilder with(
      String key, String operation, Object value, String prefix, String suffix) {
     
        SearchOperation op = SearchOperation.getSimpleOperation(operation.charAt(0));
        if (op != null) {
            if (op == SearchOperation.EQUALITY) {
                boolean startWithAsterisk = prefix.contains("*");
                boolean endWithAsterisk = suffix.contains("*");
 
                if (startWithAsterisk && endWithAsterisk) {
                    op = SearchOperation.CONTAINS;
                } else if (startWithAsterisk) {
                    op = SearchOperation.ENDS_WITH;
                } else if (endWithAsterisk) {
                    op = SearchOperation.STARTS_WITH;
                }
            }
            params.add(new SearchCriteria(key, op, value));
        }
        return this;
    }
 
    public Specification<Course> build() {
        if (params.size() == 0) {
            return null;
        }
 
        Specification<Course> result = new CourseSpecification(params.get(0));
      
        for (int i = 1; i < params.size(); i++) {
            result = params.get(i).isOrPredicate()
              ? Specification.where(result).or(new CourseSpecification(params.get(i))) 
              : Specification.where(result).and(new CourseSpecification(params.get(i)));
        }
 
        return result;
    }
}

package phanlamtruonghai.iscmanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.criteria.Join;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import phanlamtruonghai.iscmanagement.exception.ResourceNotFoundException;
import phanlamtruonghai.iscmanagement.repository.CourseRepository;
import phanlamtruonghai.iscmanagement.model.Course;
import phanlamtruonghai.iscmanagement.model.SearchOperation;
import phanlamtruonghai.iscmanagement.Specification.*;

import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryBuilders.*;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.action.search.*;
import com.google.common.base.Joiner; 

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CourseController {
	@Autowired
	private CourseRepository courseRepository;

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@GetMapping("/courses/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable(value = "id") Long courseId)
			throws ResourceNotFoundException {
		Course course = courseRepository.findById(courseId)
				.orElseThrow(() -> new ResourceNotFoundException("Course not found for this id :: " + courseId));
		return ResponseEntity.ok().body(course);
	}

	@PostMapping("/courses")
	public Course createCourse(@Valid @RequestBody Course course) {
		return courseRepository.save(course);
	}

	@PutMapping("/courses/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable(value = "id") Long courseId,
			@Valid @RequestBody Course courseDetails) throws ResourceNotFoundException {
		Course course = courseRepository.findById(courseId)
				.orElseThrow(() -> new ResourceNotFoundException("Course not found for this id :: " + courseId));

		course.setTopic(courseDetails.getTopic());
		course.setStart(courseDetails.getStart());
		course.setEnd(courseDetails.getEnd());
		course.setDescription(courseDetails.getDescription());
		final Course updatedCourse = courseRepository.save(course);
		return ResponseEntity.ok(updatedCourse);
	}

	@DeleteMapping("/courses/{id}")
	public Map<String, Boolean> deleteCourse(@PathVariable(value = "id") Long courseId)
			throws ResourceNotFoundException {
		Course course = courseRepository.findById(courseId)
				.orElseThrow(() -> new ResourceNotFoundException("Course not found for this id :: " + courseId));

		courseRepository.delete(course);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
//	@GetMapping("/courses/espec")
//	public List<Course> findAllByOrPredicate(@PathVariable(value = "search") String search) {
//	    Specification<Course> spec = resolveSpecification(search);
//	    return courseRepository.findAll(spec);
//	}
	 
//	protected Specification<Course> resolveSpecification(String searchParameters) {
//		CourseSpecificationsBuilder builder = new CourseSpecificationsBuilder();
//	    String operationSetExper = Joiner.on("|").join(SearchOperation.SIMPLE_OPERATION_SET);
//	    Pattern pattern = Pattern.compile(
//	      "(\\w+?)(" + operationSetExper + ")(\\p{Punct}?)(\\\\w+?)(\\p{Punct}?),");
//	    Matcher matcher = pattern.matcher(searchParameters + ",");
//	    while (matcher.find()) {
//	        builder.with(matcher.group(1), matcher.group(2), matcher.group(4), 
//	        matcher.group(3), matcher.group(5));
//	    }
//	     
//	    return builder.build();
//	}
	
}

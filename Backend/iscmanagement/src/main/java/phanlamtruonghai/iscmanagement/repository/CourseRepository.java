package phanlamtruonghai.iscmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import phanlamtruonghai.iscmanagement.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{

}

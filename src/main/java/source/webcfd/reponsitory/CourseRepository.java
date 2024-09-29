package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}

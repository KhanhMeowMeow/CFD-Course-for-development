package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.CourseLevel;

@Repository
public interface CourseLevelRepository extends JpaRepository<CourseLevel,Long> {
}

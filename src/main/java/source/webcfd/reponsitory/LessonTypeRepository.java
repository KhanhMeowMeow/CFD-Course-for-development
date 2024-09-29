package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.LessonType;

@Repository
public interface LessonTypeRepository extends JpaRepository<LessonType,Long> {
}

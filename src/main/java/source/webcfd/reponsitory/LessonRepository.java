package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson,Long> {
}

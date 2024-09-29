package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment,Long> {
}

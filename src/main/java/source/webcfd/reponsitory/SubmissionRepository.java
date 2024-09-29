package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.Submission;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}

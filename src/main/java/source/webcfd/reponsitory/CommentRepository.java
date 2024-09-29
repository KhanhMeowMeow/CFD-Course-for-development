package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}

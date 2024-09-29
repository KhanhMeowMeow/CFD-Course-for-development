package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

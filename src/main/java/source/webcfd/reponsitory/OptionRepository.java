package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {
}

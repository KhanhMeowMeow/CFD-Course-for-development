package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

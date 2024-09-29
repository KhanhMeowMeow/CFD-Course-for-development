package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.Video;

@Repository
public interface VideoReponsitory extends JpaRepository<Video, Long> {

}

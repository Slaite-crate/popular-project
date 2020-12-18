package dk.kea.popular.repository;

import dk.kea.popular.model.Video;
import org.springframework.data.repository.CrudRepository;

public interface VideoRepository extends CrudRepository<Video, Long> {
}

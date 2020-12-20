package dk.kea.popular.repository;

import dk.kea.popular.model.Video;
import org.springframework.data.repository.CrudRepository;

public interface VideoRepository extends CrudRepository<Video, Long> {
    public Iterable<Video> findAllByOrderByName();
    public Iterable<Video> findAllByOrderByUrl();
    public Iterable<Video> findAllByOrderByViewsDesc();
    public Iterable<Video> findAllByOrderByLikesDesc();
    public Iterable<Video> findAllByOrderByLengthDesc();
    public Iterable<Video> findAllByOrderByDateDesc();
    public Iterable<Video> findAllByOrderByCategory();
}

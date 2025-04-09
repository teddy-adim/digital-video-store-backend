package com.digitalvideostore.repository;

import com.digitalvideostore.model.Media;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface MediaRepository extends MongoRepository<Media, String> {
    List<Media> findByType(String type);
    List<Media> findByTitleContainingIgnoreCase(String title);
    List<Media> findByTypeAndFeaturedTrue(String type);
}

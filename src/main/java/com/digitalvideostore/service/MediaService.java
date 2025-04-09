package com.digitalvideostore.service;

import com.digitalvideostore.model.Media;
import com.digitalvideostore.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediaService {
    @Autowired private MediaRepository mediaRepo;

    public Media addMedia(Media media) {
        return mediaRepo.save(media);
    }

    public List<Media> getAllByType(String type) {
        return mediaRepo.findByType(type);
    }

    public Optional<Media> getById(String id) {
        return mediaRepo.findById(id);
    }

    public List<Media> searchByTitle(String title) {
        return mediaRepo.findByTitleContainingIgnoreCase(title);
    }

    public List<Media> getFeatured(String type) {
        return mediaRepo.findByTypeAndFeaturedTrue(type);
    }

    public void deleteById(String id) {
        mediaRepo.deleteById(id);
    }
}

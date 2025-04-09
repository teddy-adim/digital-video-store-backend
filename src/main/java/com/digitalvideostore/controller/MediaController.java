package com.digitalvideostore.controller;

import com.digitalvideostore.model.Media;
import com.digitalvideostore.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/media")
public class MediaController {
    @Autowired private MediaService mediaService;

    @PostMapping
    public ResponseEntity<Media> add(@RequestBody Media media) {
        return ResponseEntity.ok(mediaService.addMedia(media));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable String id) {
        return mediaService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Media> getByType(@RequestParam String type) {
        return mediaService.getAllByType(type);
    }

    @GetMapping("/search")
    public List<Media> search(@RequestParam String title) {
        return mediaService.searchByTitle(title);
    }

    @GetMapping("/featured")
    public List<Media> getFeatured(@RequestParam String type) {
        return mediaService.getFeatured(type);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        mediaService.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}

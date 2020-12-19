package dk.kea.popular.controller;

import dk.kea.popular.model.Video;
import dk.kea.popular.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VideoRestController {

    @Autowired
    private VideoRepository videoRepository;

    @CrossOrigin(origins = "*", exposedHeaders = "Location")
    @PostMapping(value = "/video", consumes = {"application/json"})
    public ResponseEntity<String> create(@RequestBody Video video){
        videoRepository.save(video);
        return ResponseEntity.status(201).header("location", "/video/" + video.getId()).body("{'message': 'post created'}");
    }

    @GetMapping("/videoobjects")
    public Iterable<Video> findAll(){
        return videoRepository.findAll();
    }

}
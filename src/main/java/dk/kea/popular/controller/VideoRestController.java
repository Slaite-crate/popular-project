package dk.kea.popular.controller;

import dk.kea.popular.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoRestController {

    @Autowired
    private VideoRepository videoRepository;


}

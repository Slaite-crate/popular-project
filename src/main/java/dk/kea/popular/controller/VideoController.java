package dk.kea.popular.controller;

import dk.kea.popular.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VideoController {

    @Autowired
    private VideoRepository videoRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/video")
    public String readAll(Model model){
        model.addAttribute("videos", videoRepository.findAll());
        return "video";
    }

    @GetMapping("/video/{by}")
    public String readAllBy(@PathVariable String by, Model model){
        switch (by){
            case "name":
                model.addAttribute("videos", videoRepository.findAllByOrderByName());
                break;
            case "url":
                model.addAttribute("videos", videoRepository.findAllByOrderByUrl());
                break;
            case "views":
                model.addAttribute("videos", videoRepository.findAllByOrderByViewsDesc());
                break;
            case "likes":
                model.addAttribute("videos", videoRepository.findAllByOrderByLikesDesc());
                break;
            case "length":
                model.addAttribute("videos", videoRepository.findAllByOrderByLengthDesc());
                break;
            case "date":
                model.addAttribute("videos", videoRepository.findAllByOrderByDateDesc());
                break;
            case "category":
                model.addAttribute("videos", videoRepository.findAllByOrderByCategory());
                break;
        }
        return "video";
    }
}

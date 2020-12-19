package dk.kea.popular.controller;

import dk.kea.popular.model.Video;
import dk.kea.popular.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@Controller
public class VideoController {

    @Autowired
    private VideoRepository videoRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/videos")
    public String readAll(Model model){
        model.addAttribute("videos", videoRepository.findAll());
        return "videos";
    }

    @GetMapping("/videosbyname")
    public String readAllByName(Model model){
        ArrayList<Video> vl = new ArrayList<>();
        for (Video v : videoRepository.findAll()){
            vl.add(v);
        }
        Collections.sort(vl, new Comparator<Video>(){
            @Override
            public int compare(Video v1, Video v2){
                return v1.getName().compareToIgnoreCase(v2.getName());
            }
        });
        model.addAttribute("videos", vl);
        return "videos";
    }

    @GetMapping("/videosbyviews")
    public String readAllByViews(Model model){
        ArrayList<Video> vl = new ArrayList<>();
        for (Video v : videoRepository.findAll()){
            vl.add(v);
        }
        Collections.sort(vl, new Comparator<Video>() {
            @Override
            public int compare(Video o1, Video o2) {
                return o1.getViews() - o2.getViews();
            }
        });
        model.addAttribute("videos", vl);
        return "videos";
    }
}

package com.zacharyRichmond.controller;

import com.zacharyRichmond.entity.Story;
import com.zacharyRichmond.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ZXR0185 on 3/1/2017.
 */

@RestController
public class StoryController {
    @Autowired
    StoryService storyService;

    @GetMapping("/getAllStories")
    public List<Story> getAllStories(){
        return storyService.getAllStories();
    }

}
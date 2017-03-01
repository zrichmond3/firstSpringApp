package com.zacharyRichmond.service;

import com.zacharyRichmond.entity.Story;
import com.zacharyRichmond.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ZXR0185 on 3/1/2017.
 */
@Component
public class StoryService {
    @Autowired
    StoryRepository storyRepository;

    public List<Story> getAllStories(){
        return storyRepository.findAll();
    }

}

package com.zacharyRichmond.repository;

import com.zacharyRichmond.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by ZXR0185 on 3/1/2017.
 */

@Component
public interface StoryRepository extends JpaRepository<Story, Long> {
    //Jpa to know if you have a list of stories, it does a find on all of them and pulls them out of the DB



}

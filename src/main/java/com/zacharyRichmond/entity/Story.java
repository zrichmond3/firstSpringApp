package com.zacharyRichmond.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ZXR0185 on 3/1/2017.
 */

@Entity
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String storyName;

    public Story() {
    }

    public Story(String storyName) {
        this.storyName = storyName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }
}



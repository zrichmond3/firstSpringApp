package com.zacharyRichmond.configuration;

import com.zacharyRichmond.entity.Story;
import com.zacharyRichmond.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

/**
 * Created by ZXR0185 on 3/1/2017.
 */
@Configuration
@ComponentScan
@Profile("default")
public class StoryConfiguration {

    @Autowired //auto will go through each package looking for beans, components, and turn them to into beans.
    StoryRepository storyRepository;

    @Bean
    @Primary
    public StoryRepository setStoryRepository(){
        Story story1 = new Story("story1");
        Story story2 = new Story("story2");
        Story story3 = new Story("story3");

        storyRepository.save(story1);
        storyRepository.save(story2);
        storyRepository.save(story3);

        return storyRepository;
    }

}

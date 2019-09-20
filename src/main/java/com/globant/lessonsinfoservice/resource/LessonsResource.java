package com.globant.lessonsinfoservice.resource;

import com.globant.lessonsinfoservice.model.LessonInformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lessons")
public class LessonsResource {

    @GetMapping("/numberoflessons/{userId}")
    public Integer createLesson (@PathVariable("userId") int userId){
        // Return number of lessons given.
        return 8;

    }
}

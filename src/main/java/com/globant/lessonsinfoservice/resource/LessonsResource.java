package com.globant.lessonsinfoservice.resource;

import com.globant.lessonsinfoservice.model.Lesson;
import com.globant.lessonsinfoservice.model.Record;
import com.globant.lessonsinfoservice.repository.LessonRepository;
import java.time.LocalDate;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lessons")
public class LessonsResource {

  private final LessonRepository lessonRepository;

  @Autowired
  public LessonsResource(LessonRepository lessonRepository) {
    this.lessonRepository = lessonRepository;
  }

  @GetMapping("/numberoflessons/{userId}")
  public Record getLessons(@PathVariable("userId") int userId) {
    // All the lessons received
    return new Record(lessonRepository.findByUserId(userId));
  }
}

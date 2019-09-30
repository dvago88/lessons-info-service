package com.globant.lessonsinfoservice.resource;

import com.globant.lessonsinfoservice.model.Lesson;
import com.globant.lessonsinfoservice.model.Record;
import com.globant.lessonsinfoservice.service.LessonService;
import com.globant.lessonsinfoservice.service.LessonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lessons")
public class LessonsResource {

  private final LessonService lessonService;

  @Autowired
  public LessonsResource(LessonServiceImpl lessonService) {
    this.lessonService = lessonService;
  }

  @GetMapping("/numberoflessons/{userId}")
  public Record getLessons(@PathVariable("userId") int userId) {
    // All the lessons received
    return new Record(lessonService.findByUserId(userId));
  }

  @PostMapping(value = "/",
      consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public Lesson createLesson(@RequestBody Lesson lesson) {
    return lessonService.save(lesson);
  }
}

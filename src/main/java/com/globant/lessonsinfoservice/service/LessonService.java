package com.globant.lessonsinfoservice.service;

import com.globant.lessonsinfoservice.model.Lesson;
import java.util.List;

public interface LessonService {

  List<Lesson> findByUserId(int userId);

  Lesson save(Lesson lesson);
}

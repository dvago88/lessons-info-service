package com.globant.lessonsinfoservice.service;

import com.globant.lessonsinfoservice.model.Lesson;
import com.globant.lessonsinfoservice.repository.LessonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService {

  private final LessonRepository lessonRepository;

  @Autowired
  public LessonServiceImpl(LessonRepository lessonRepository) {
    this.lessonRepository = lessonRepository;
  }

  @Override
  public List<Lesson> findByUserId(int userId) {
    return lessonRepository.findByUserId(userId);
  }

  @Override
  public Lesson save(Lesson lesson) {
    return lessonRepository.save(lesson);
  }
}

package com.globant.lessonsinfoservice.repository;

import com.globant.lessonsinfoservice.model.Lesson;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson,Integer> {
    List<Lesson> findByUserId(int userId);
}

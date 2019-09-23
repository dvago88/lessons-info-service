package com.globant.lessonsinfoservice.resource;

import com.globant.lessonsinfoservice.model.Lesson;
import com.globant.lessonsinfoservice.model.Record;
import java.time.LocalDate;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lessons")
public class LessonsResource {

  @GetMapping("/numberoflessons/{userId}")
  public Record getLessons(@PathVariable("userId") int userId) {
    // Return number of lessons given.
    return new Record(Arrays.asList(
        new Lesson(1, userId, "Clase de prueba número 1", LocalDate.now(), "Maria Luisa"),
        new Lesson(2, userId, "Clase de prueba número 2", LocalDate.now(), "Maria Luisa"),
        new Lesson(3, userId, "Clase de prueba número 3", LocalDate.now(), "Maria Luisa"),
        new Lesson(4, userId, "Clase de prueba número 4", LocalDate.now(), "Maria Luisa"),
        new Lesson(5, userId, "Clase de prueba número 5", LocalDate.now(), "Maria Luisa"),
        new Lesson(6, userId, "Clase de prueba número 6", LocalDate.now(), "Maria Luisa"),
        new Lesson(7, userId, "Clase de prueba número 7", LocalDate.now(), "Maria Luisa"),
        new Lesson(8, userId, "Clase de prueba número 8", LocalDate.now(), "Maria Luisa")
    ));
  }
}

package com.globant.lessonsinfoservice.model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lesson {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int lessonId;
  private int userId;
  private String description;
  private LocalDate date;
  private String place;

  public Lesson() {
  }

  public Lesson(int lessonId, int userId, String description, LocalDate date, String place) {
    this.lessonId = lessonId;
    this.userId = userId;
    this.description = description;
    this.date = date;
    this.place = place;
  }

  public int getLessonId() {
    return lessonId;
  }

  public void setLessonId(int lessonId) {
    this.lessonId = lessonId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }
}

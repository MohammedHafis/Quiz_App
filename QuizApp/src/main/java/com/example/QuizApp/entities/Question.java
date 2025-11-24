package com.example.QuizApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String difficultylevel;
    private String option1;
    private String option2;
    private String option3;
    private String category;
    private String questionTitle;
    private String rightAnswer;

}

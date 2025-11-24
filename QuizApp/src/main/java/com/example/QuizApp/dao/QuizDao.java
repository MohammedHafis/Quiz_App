package com.example.QuizApp.dao;

import com.example.QuizApp.entities.Question;
import com.example.QuizApp.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}



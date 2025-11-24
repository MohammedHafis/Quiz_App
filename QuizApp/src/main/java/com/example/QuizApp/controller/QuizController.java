package com.example.QuizApp.controller;

import com.example.QuizApp.entities.Question;
import com.example.QuizApp.entities.QuestionWrapper;
import com.example.QuizApp.entities.ResponseWrapper;
import com.example.QuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        return quizService.createQuiz(category,numQ,title);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuiz(@PathVariable Integer id){
        return quizService.getQuiz(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitResponse(@PathVariable Integer id, @RequestBody List<ResponseWrapper> responses){
        return quizService.submitResponse(id, responses);
    }
}

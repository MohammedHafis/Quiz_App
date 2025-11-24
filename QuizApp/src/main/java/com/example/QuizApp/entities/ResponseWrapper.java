package com.example.QuizApp.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@Data
//@RequiredArgsConstructor
public class ResponseWrapper {


    private Integer id;
    private String response;

    public ResponseWrapper(Integer id, String response){
        this.id=id;
        this.response=response;
    }
}



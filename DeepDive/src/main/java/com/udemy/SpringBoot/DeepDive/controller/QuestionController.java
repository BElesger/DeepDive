package com.udemy.SpringBoot.DeepDive.controller;

import com.udemy.SpringBoot.DeepDive.model.Question;
import com.udemy.SpringBoot.DeepDive.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @GetMapping("/surveys/{surveyId}/questions")
    public ArrayList<Question> getQuestionsBySurveyID(@PathVariable String surveyId) {
        return questionService.getQuestions(surveyId);
    }

}

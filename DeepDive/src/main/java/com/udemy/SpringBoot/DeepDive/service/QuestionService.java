package com.udemy.SpringBoot.DeepDive.service;

import com.udemy.SpringBoot.DeepDive.model.Question;
import com.udemy.SpringBoot.DeepDive.model.Survey;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;


@Component
public class QuestionService {

    private static ArrayList<Question> questions = new ArrayList<>();

    private static HashMap<String, Survey> surveys = new HashMap<>();

    static {
        questions.add(new Question(1, "Largest Lake", "Caspian"));
        questions.add(new Question(2, "Capital of Turkmenistan", "Ashgabat"));
        questions.add(new Question(3, "Highest mountain", "Everest"));
        questions.add(new Question(4, "Longest river", "Nile"));
        questions.add(new Question(5, "Currency of Georgia", "Lari"));


        surveys.put("1", new Survey(1, "For test rest path variable", questions));
    }

//    public Survey getSurveys(int surveyID) {
//
//        for (Survey s : surveys) {
//            if (s.getId() == surveyID) {
//                return s;
//            }
//        }
//        return null;
//    }

    public static ArrayList<Question> getQuestions(String surveyID) {
        return surveys.get(surveyID).getQuestions();
    }
}
